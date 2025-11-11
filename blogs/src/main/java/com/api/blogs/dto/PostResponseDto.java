package com.api.blogs.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "DTO de respuesta para un Post. Contrato de la API.")
public class PostResponseDto {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;

    private String authorUsername;
    private String categoryName;

    @Schema(description = "Lista de comentarios asociados a este post.")
    private Set<CommentResponseDto> comments;

    @Schema(description = "Lista de etiquetas asociadas a este post.")
    private Set<TagResponseDto> tags;
}
