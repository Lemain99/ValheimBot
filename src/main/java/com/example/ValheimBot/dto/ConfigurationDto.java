package com.example.ValheimBot.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfigurationDto {
    @JsonProperty(value = "network_bandwidth")
    private Integer networkBandwidth = 200;
    @JsonProperty("disk_size")
    private Float diskSize;
    @JsonProperty("is_ddos_guard")
    private Boolean isDdosGuard;
    @JsonProperty("vds_boot")
    private String vdsBoot;
    @JsonProperty("backup_size")
    private Integer backupSize;
    @JsonProperty(value = "caption")
    private String caption="server123";
    @JsonProperty(value = "os")
    private Integer os = 61;
    @JsonProperty(value = "software")
    private Integer software = 25;
}
