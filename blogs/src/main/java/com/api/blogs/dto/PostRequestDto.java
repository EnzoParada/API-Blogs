package com.api.blogs.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "DTO para crear o actualizar un Post.")
public class PostRequestDto {

    @NotBlank(message = "El titulo es obligatorio.")
    private String title;

    @NotBlank(message = "El contenido es obligatorio.")
    private String content;

    @NotNull(message = "Se requiere el ID de la categoría.")
    private Long categoryId;

    private List<Long> tagIds;
}
