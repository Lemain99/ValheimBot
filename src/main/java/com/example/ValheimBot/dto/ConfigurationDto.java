package com.example.ValheimBot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigurationDto {
    @JsonProperty(value = "network_bandwidth")
    private Integer networkBandwidth = 200;
    @JsonProperty(value = "os")
    private Integer os = 61;
    @JsonProperty(value = "software")
    private Integer software = 25;
}
