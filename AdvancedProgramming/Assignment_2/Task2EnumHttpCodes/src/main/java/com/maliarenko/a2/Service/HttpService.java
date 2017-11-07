package com.maliarenko.a2.Service;

import com.maliarenko.a2.Status.HttpStatus;

import java.io.IOException;

public class HttpService {
    public void handleHttpCode(int code) throws IOException {
        HttpStatus httpCode = HttpStatus.findByHttpCode(code);
        httpCode.getHandler().handle(code);
    }
}
