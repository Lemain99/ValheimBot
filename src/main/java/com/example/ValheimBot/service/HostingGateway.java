package com.example.ValheimBot.service;

import com.example.ValheimBot.dto.CreateServerDto;
import com.example.ValheimBot.dto.ServerDto;

public interface HostingGateway {
    String auth(String refreshToken);
    ServerDto create(String accessToken);
    void delete(Integer id);
    String checkStatus(Integer id);
    ServerDto.Root getServerById(Integer id);
}
