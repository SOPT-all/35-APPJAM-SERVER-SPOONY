package com.spoony.spoony_server.domain.post.dto.response;

import java.util.List;

public record PostResponseDTO(Long postId, Long userId, String userName, String userRegion, String category,
                              String title,
                              String date,
                              List<String> menuList,
                              String description,
                              String place_name, String place_address, Double latitude,
                              Double longitude, Long zzinCount
) {
}


//Integer postId, String title, String description, LocalDateTime createdAt, LocalDateTime updatedAt