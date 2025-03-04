package com.spoony.spoony_server.adapter.dto.zzim;

import java.util.List;

public record PostCreateRequestDTO(String title,
                                   String description,
                                   String placeName,
                                   String placeAddress,
                                   String placeRoadAddress,
                                   Double latitude,
                                   Double longitude,
                                   long categoryId,
                                   List<String> menuList) {
}
