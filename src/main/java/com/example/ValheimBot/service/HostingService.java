package com.example.ValheimBot.service;

import com.example.ValheimBot.dto.ServerDto;

public interface HostingService {
    String auth(String refreshToken);
    ServerDto create(String accessToken);
    void delete(Integer id);
    String checkStatus(Integer id);
}
