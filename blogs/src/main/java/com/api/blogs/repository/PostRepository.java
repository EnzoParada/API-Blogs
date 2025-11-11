package com.api.blogs.repository;

import com.api.blogs.entity.Post;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {

    Optional<Post> findByTitle(String title);

    Page<Post> findByCategoryId(Long categoryId, Pageable pageable);

    Page<Post> findByTitleContaining(String title, Pageable pageable);
}
