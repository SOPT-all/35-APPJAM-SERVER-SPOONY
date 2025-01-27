package com.spoony.spoony_server.domain.post.dto;

import java.util.List;

public record PostCreateDTO(Long userId,
                            String title,
                            String description,
                            String placeName,
                            String placeAddress,
                            String placeRoadAddress,
                            Double latitude,
                            Double longitude,
                            Long categoryId,
                            List<String> menuList,
                            List<String> photoUrlList) {
}
