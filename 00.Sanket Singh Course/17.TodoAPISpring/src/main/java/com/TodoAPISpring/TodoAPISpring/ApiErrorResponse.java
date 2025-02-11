package com.TodoAPISpring.TodoAPISpring;

import org.springframework.stereotype.Component;

@Component
public class ApiErrorResponse {
    private int code;
    private String message;

    public ApiErrorResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;

    }

    public void setStatusCode(int code) {
        this.code = code;
    }

    public void setStatusMessage(String message) {
        this.message = message;
    }
}