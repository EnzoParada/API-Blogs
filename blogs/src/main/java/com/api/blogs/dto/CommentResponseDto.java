package com.api.blogs.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "DTO de respuesta para un Comentario.")
public class CommentResponseDto {

    private Long id;
    private String content;
    private LocalDateTime createdAt;

    private String authorUsername;
}
