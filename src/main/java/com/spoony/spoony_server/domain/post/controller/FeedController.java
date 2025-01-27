package com.spoony.spoony_server.domain.post.controller;

import com.spoony.spoony_server.common.dto.ResponseDTO;
import com.spoony.spoony_server.domain.post.dto.response.FeedListResponseDTO;
import com.spoony.spoony_server.domain.post.service.FeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/feed")
public class FeedController {

    private final FeedService feedService;

    @GetMapping("/{userId}/{categoryId}")
    public ResponseEntity<ResponseDTO<FeedListResponseDTO>> getPost(@PathVariable Long userId,
                                                                    @PathVariable Long categoryId,
                                                                    @RequestParam(name = "query") String locationQuery,
                                                                    @RequestParam(name = "sortBy") String sortBy) {
        FeedListResponseDTO feedListResponse = feedService.getFeedListByUserId(userId, categoryId, locationQuery, sortBy);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseDTO.success(feedListResponse));
    }
}
