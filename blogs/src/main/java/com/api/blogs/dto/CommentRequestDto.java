package com.api.blogs.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "DTO para crear un nuevo Comentario.")
public class CommentRequestDto {

    @NotBlank(message = "El contenido del comentario no puede estar vacío.")
    @Size(min = 5, max = 500, message = "El comentario debe tener entre 5 y 500 caracteres.")
    private String content;


}
