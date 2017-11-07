package com.maliarenko.a2.myhandler;

import java.io.IOException;

public class HttpRedirectionHandler implements CustomHandler {
    public void handle(int context) throws IOException {
        //do smth;
        System.out.println("returned with http status: " + context +  ". Redirection");
    }
}
