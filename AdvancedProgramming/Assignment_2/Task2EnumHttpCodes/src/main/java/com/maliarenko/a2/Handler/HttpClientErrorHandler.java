package com.maliarenko.a2.Handler;

import java.io.IOException;

public class HttpClientErrorHandler implements CustomHandler {
    public void handle(int context) throws IOException {
        //do smth;
        System.out.println("returned with http status: " + context +  ". ClientError");
    }
}
