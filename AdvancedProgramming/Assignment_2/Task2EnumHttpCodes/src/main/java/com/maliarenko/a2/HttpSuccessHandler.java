package com.maliarenko.a2;

import java.io.IOException;

public class HttpSuccessHandler implements CustomHandler {
    public void handle(int context) throws IOException {
        //do smth;
        System.out.println("returned with http status: " + context +  ". Success");
    }
}
