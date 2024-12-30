package com.example.spoony.common.message;

import org.springframework.http.HttpStatus;

public interface DefaultErrorMessage {
    HttpStatus getHttpStatus();
    String getMessage();
}
