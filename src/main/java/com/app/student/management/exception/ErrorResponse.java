package com.app.student.management.exception;

import java.time.LocalDateTime;

public class ErrorResponse {
    private String name;
    private int statusCode;
    private LocalDateTime timeStamp;

    public ErrorResponse(String name, int statusCode, LocalDateTime timeStamp) {
        this.name = name;
        this.statusCode = statusCode;
        this.timeStamp = LocalDateTime.now();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getName() {
        return name;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }
}
