package com.example.ValheimBot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServerDto {
    @JsonProperty(value = "configuration")
    ConfigurationDto configuration;
    @JsonProperty(value = "server_id")
    private Integer serverId = 3;
    @JsonProperty(value = "group_id")
    private Integer groupId = 353779;
    @JsonProperty(value = "preset_id")
    private Integer presetId = 2623;
}
