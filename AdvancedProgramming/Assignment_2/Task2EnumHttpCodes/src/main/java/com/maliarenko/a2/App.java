package com.maliarenko.a2;

import com.maliarenko.a2.service.HttpService;

import java.io.IOException;

/**
 * HttpService!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        HttpService httpService = new HttpService();
        httpService.handleHttpCode(200);
    }
}
