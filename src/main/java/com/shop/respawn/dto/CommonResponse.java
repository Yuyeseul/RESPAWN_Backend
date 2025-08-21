package com.shop.respawn.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.shop.respawn.exception.status_code.BaseCode;
import com.shop.respawn.exception.status_code.SuccessStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@JsonPropertyOrder
public class CommonResponse<T> {
    private final Boolean isSuccess;
    private final String code;
    private final String message;
    private T result;

    public static <T> CommonResponse<T> ok(T result) {
        return new CommonResponse<>(true, SuccessStatus._OK.getCode(),
                SuccessStatus._OK.getMessage(), result);
    }

    public static <T> CommonResponse<T> of(BaseCode code, T result) {
        return new CommonResponse<>(true, code.getCode(), code.getMessage(), result);
    }

    public static <T> CommonResponse<T> onFailure(String code, String message, T result) {
        return new CommonResponse<>(false, code, message, result);
    }
}