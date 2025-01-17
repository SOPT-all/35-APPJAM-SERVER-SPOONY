package com.spoony.spoony_server.domain.post.controller;

import com.spoony.spoony_server.common.dto.ResponseDTO;
import com.spoony.spoony_server.domain.post.dto.request.PostCreateRequestDTO;
import com.spoony.spoony_server.domain.post.dto.response.CategoryMonoListResponseDTO;
import com.spoony.spoony_server.domain.post.dto.response.CategoryMonoResponseDTO;
import com.spoony.spoony_server.domain.post.dto.response.PostResponseDTO;
import com.spoony.spoony_server.domain.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/{postId}")
    public ResponseEntity<ResponseDTO<PostResponseDTO>> getPost(@PathVariable Long postId) {
        PostResponseDTO postResponse = postService.getPostById(postId);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseDTO.success(postResponse));
    }

    @PostMapping
    public ResponseEntity<ResponseDTO<Void>> createPost(@RequestBody PostCreateRequestDTO postCreateRequestDTO) {
        postService.createPost(postCreateRequestDTO);

        return ResponseEntity.status(HttpStatus.OK).body(ResponseDTO.success(null));
    }

    @GetMapping("/categories")
    public ResponseEntity<ResponseDTO<CategoryMonoListResponseDTO>> getAllCategories() {
        CategoryMonoListResponseDTO categoryMonoListResponseDTO = postService.getAllCategories();
        return ResponseEntity.status(HttpStatus.OK).body(ResponseDTO.success(categoryMonoListResponseDTO));
    }

    @GetMapping("/categories/food")
    public ResponseEntity<ResponseDTO<CategoryMonoListResponseDTO>> getFoodCategories() {
        CategoryMonoListResponseDTO categoryMonoListResponseDTO = postService.getFoodCategories();
        return ResponseEntity.status(HttpStatus.OK).body(ResponseDTO.success(categoryMonoListResponseDTO));
    }
}
