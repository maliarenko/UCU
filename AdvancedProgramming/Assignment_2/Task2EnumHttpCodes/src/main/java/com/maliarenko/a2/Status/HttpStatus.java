package com.maliarenko.a2.status;

import com.maliarenko.a2.handler.*;

import java.util.NoSuchElementException;

public enum HttpStatus {

    INFORMATIONAL(100, 199, new HttpInformationalHandler()),
    SUCCESS (200,299, new HttpSuccessHandler()),
    REDIRECTION (300, 399, new HttpRedirectionHandler()),
    CLIENTERROR (400, 499, new HttpClientErrorHandler()),
    SERVERERROR (500, 599, new HttpServerErrorHandler());

    private int min;
    private int max;
    private CustomHandler handler;

    HttpStatus(int min, int max, CustomHandler handler) {
        this.handler = handler;
        this.max = max;
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public CustomHandler getHandler() {
        return handler;
    }

    public static HttpStatus findByHttpCode(int code) {
        for (HttpStatus status : values()) {
            if (code >= status.getMin() && code <= status.getMax()) {
                return status;
            }
        }
        throw  new NoSuchElementException("unknow code: " + code);
    }

}
