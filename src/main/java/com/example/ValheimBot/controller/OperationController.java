package com.example.ValheimBot.controller;

import com.example.ValheimBot.dto.ServerDto;
import com.example.ValheimBot.service.HostingGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/operate")
public class OperationController {
@Autowired
   private RestTemplate restTemplate;
@Autowired
private HostingGateway hostingGateway;
    @GetMapping("/")
    public ResponseEntity Test(){
        ServerDto.Root serverById = hostingGateway.getServerById(1084639);
        return ResponseEntity.ok(serverById) ;
    }
}
