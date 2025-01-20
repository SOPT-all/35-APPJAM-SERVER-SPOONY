package com.spoony.spoony_server.domain.post.controller;

import com.spoony.spoony_server.common.dto.ResponseDTO;
import com.spoony.spoony_server.domain.post.dto.response.FeedListResponseDTO;
import com.spoony.spoony_server.domain.post.service.FeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/feed")
@RequiredArgsConstructor
public class FeedController {

    private final FeedService feedService;

    @GetMapping("/{userId}")
    public ResponseEntity<ResponseDTO<FeedListResponseDTO>> getAllFeeds(@PathVariable Long userId,
                                                                        @RequestParam(name = "query") String locationQuery,
                                                                        @RequestParam(name = "sortBy") String sortBy) {

        FeedListResponseDTO feedListResponse = feedService.getFeedList(userId, locationQuery, sortBy);

        return ResponseEntity.status(HttpStatus.OK).body(ResponseDTO.success(feedListResponse));
    }

    @GetMapping("/{userId}/{categoryId}")
    public ResponseEntity<ResponseDTO<FeedListResponseDTO>> getFilteredFeedsByCategory(@PathVariable Long userId, @PathVariable Long categoryId,
                                                                                       @RequestParam(name = "query") String locationQuery,
                                                                                       @RequestParam(name = "sortBy") String sortBy) {

        FeedListResponseDTO feedListResponse = feedService.getFeedListByCategory(userId, categoryId, locationQuery, sortBy);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseDTO.success(feedListResponse));
        
    }
}
