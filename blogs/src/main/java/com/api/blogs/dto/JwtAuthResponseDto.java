package com.api.blogs.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "DTO de respuesta para el login exitoso (contiene el token JWT).")
public class JwtAuthResponseDto {

    private String accessToken;

    private String tokenType = "Bearer";

    private String username;

    private List<String> roles;

    public JwtAuthResponseDto(String accessToken, String username, List<String> roles) {
        this.accessToken = accessToken;
        this.username = username;
        this.roles = roles;
        this.tokenType = "Bearer";
    }
}
