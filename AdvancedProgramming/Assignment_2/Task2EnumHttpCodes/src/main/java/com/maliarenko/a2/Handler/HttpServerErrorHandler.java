package com.maliarenko.a2.handler;

import java.io.IOException;

public class HttpServerErrorHandler implements CustomHandler {
    public void handle(int context) throws IOException {
        //do smth;
        System.out.println("returned with http status: " + context +  ". ServerError");
    }
}
