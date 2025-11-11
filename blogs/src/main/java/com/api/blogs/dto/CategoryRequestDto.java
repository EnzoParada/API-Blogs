package com.api.blogs.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "DTO de solicitud para crear o actualizar una Categoría.")
public class CategoryRequestDto {

    @NotBlank(message = "El nombre de la categoría es obligatorio.")
    @Size(min = 3, max = 100, message = "El nombre debe tener entre 3 y 100 caracteres.")
    @Schema(description = "Nombre único de la categoría (ej: 'Backend', 'Frontend').")
    private String name;
}

