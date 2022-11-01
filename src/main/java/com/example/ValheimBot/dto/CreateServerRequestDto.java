package com.example.ValheimBot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateServerRequestDto {
    @JsonProperty(value = "server")
    ServerDto server ;
}
