package com.example.spoony.common.dto;

import com.example.spoony.common.message.DefaultErrorMessage;

public record ResponseDto<T> (
        boolean success,
        T data,
        ErrorDto error
) {
    public static <T> ResponseDto<T> success(final T data) {
        return new ResponseDto<>(true, data, null);
    }

    public static <T> ResponseDto<T> fail(DefaultErrorMessage error) {
        return new ResponseDto<>(false, null, ErrorDto.of(error.getMessage()));
    }
}