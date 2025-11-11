package com.api.blogs.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "DTO de solicitud para iniciar sesión.")
public class LoginRequestDto {

    @NotBlank(message = "El username o email es obligatorio.")
    private String usernameOrEmail;

    @NotBlank(message = "La contraseña es obligatoria.")
    private String password;
}
