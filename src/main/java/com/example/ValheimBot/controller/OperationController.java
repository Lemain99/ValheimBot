package com.example.ValheimBot.controller;

import com.example.ValheimBot.dto.ConfigurationDto;
import com.example.ValheimBot.dto.CreateServerRequestDto;
import com.example.ValheimBot.dto.ServerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operate")
public class OperationController {

    @GetMapping("/")
    public CreateServerRequestDto Test(){
        ServerDto serverDto = new ServerDto();
        ConfigurationDto configurationDto = new ConfigurationDto();
        serverDto.setConfiguration(configurationDto);
        return new CreateServerRequestDto(serverDto);
    }
}
