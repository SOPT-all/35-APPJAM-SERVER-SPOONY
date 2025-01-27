package com.spoony.spoony_server.domain.zzim.controller;

import com.spoony.spoony_server.common.dto.ResponseDTO;
import com.spoony.spoony_server.domain.zzim.dto.request.ZzimPostAddRequestDTO;
import com.spoony.spoony_server.domain.zzim.dto.response.ZzimCardListResponseDTO;
import com.spoony.spoony_server.domain.zzim.dto.response.ZzimFocusListResponseDTO;
import com.spoony.spoony_server.domain.zzim.service.ZzimPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/post/zzim")
public class ZzimPostController {

    public final ZzimPostService zzimPostService;

    @PostMapping
    public ResponseEntity<ResponseDTO<Void>> addZzimPost(@RequestBody ZzimPostAddRequestDTO zzimPostAddRequestDTO) {
        zzimPostService.addZzimPost(zzimPostAddRequestDTO);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseDTO.success(null));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<ResponseDTO<ZzimCardListResponseDTO>> getZzimCardList(@PathVariable Long userId) {
        ZzimCardListResponseDTO zzimCardListResponse = zzimPostService.getZzimCardList(userId);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseDTO.success(zzimCardListResponse));
    }

    @GetMapping("/{userId}/{placeId}")
    public ResponseEntity<ResponseDTO<ZzimFocusListResponseDTO>> getZzimFocusList(@PathVariable Long userId, @PathVariable Long placeId) {
        ZzimFocusListResponseDTO zzimFocusListResponse = zzimPostService.getZzimFocusList(userId, placeId);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseDTO.success(zzimFocusListResponse));
    }

    @DeleteMapping("/{userId}/{placeId}")
    public ResponseEntity<ResponseDTO<Void>> deleteZzim(@PathVariable Long userId, @PathVariable Long placeId) {
        zzimPostService.deleteZzim(userId, placeId);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseDTO.success(null));
    }

    @GetMapping("/location/{userId}/{locationId}")
    public ResponseEntity<ResponseDTO<ZzimCardListResponseDTO>> getZzimCardList(@PathVariable Long userId, @PathVariable Long locationId) {
        ZzimCardListResponseDTO zzimCardListResponse = zzimPostService.getZzimByLocation(userId, locationId);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseDTO.success(zzimCardListResponse));
    }
}
