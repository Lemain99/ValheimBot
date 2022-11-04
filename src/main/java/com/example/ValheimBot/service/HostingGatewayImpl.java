package com.example.ValheimBot.service;

import com.example.ValheimBot.dto.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class HostingGatewayImpl implements HostingGateway {
    private final static String VDS_URL="/api/v1/vds";

    @Value("${hosting.timeweb.access.key:123}")
    private String accessKey;
    @Value("${hosting.timeweb.base.url:123}")
    private String baseUrl;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String auth(String refreshToken) {

        return null;
    }

    @Override
    public ServerDto create(String accessToken) {
        CreateServerDto createServerDto = new CreateServerDto();
        RequestConfigurationDto requestConfigurationDto = new RequestConfigurationDto();
        createServerDto.setConfiguration(requestConfigurationDto);
        CreateServerRequestDto createServerRequestDto = new CreateServerRequestDto(createServerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + accessToken);

        HttpEntity<CreateServerRequestDto> requestEntity = new HttpEntity<>(createServerRequestDto,headers);

        ResponseEntity<ServerDto> response = restTemplate.exchange(baseUrl + VDS_URL, HttpMethod.POST, requestEntity, ServerDto.class);
        return response.getBody();
    }

    @Override
    public void delete(Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + accessKey);

        HttpEntity<CreateServerRequestDto> requestEntity = new HttpEntity<>(headers);
        String url = baseUrl + VDS_URL + "/" + id;

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, String.class);
        log.info(response.getBody());
    }

    @Override
    public String checkStatus(Integer id) {

        return null;
    }

    @Override
    public ServerDto.Root getServerById(Integer id) {
        String url = baseUrl + VDS_URL + "/" + id;

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + accessKey);

        HttpEntity<CreateServerRequestDto> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<ServerDto.Root> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, ServerDto.Root.class);

        return response.getBody();
    }
}
