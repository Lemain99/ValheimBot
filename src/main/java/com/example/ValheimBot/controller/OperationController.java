package com.example.ValheimBot.controller;

import com.example.ValheimBot.dto.ConfigurationDto;
import com.example.ValheimBot.dto.CreateServerRequestDto;
import com.example.ValheimBot.dto.ServerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/operate")
public class OperationController {
    private final String accessToken = "123";
    private final String url = "https://public-api.timeweb.com/api/v1/vds";

@Autowired
    RestTemplate restTemplate;
    @GetMapping("/")
    public Map Test(){

        ServerDto serverDto = new ServerDto();
        ConfigurationDto configurationDto = new ConfigurationDto();
        serverDto.setConfiguration(configurationDto);
        CreateServerRequestDto createServerRequestDto = new CreateServerRequestDto(serverDto);
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + accessToken);

        HttpEntity<CreateServerRequestDto> requestEntity = new HttpEntity<>(createServerRequestDto,headers);

        ResponseEntity<Map> response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, Map.class);

        return response.getBody();
    }
}
