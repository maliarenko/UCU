package com.maliarenko.a2.service;

import com.maliarenko.a2.status.HttpStatus;

import java.io.IOException;

public class HttpService {
    public void handleHttpCode(int code) throws IOException {
        HttpStatus httpCode = HttpStatus.findByHttpCode(code);
        httpCode.getHandler().handle(code);
    }
}
