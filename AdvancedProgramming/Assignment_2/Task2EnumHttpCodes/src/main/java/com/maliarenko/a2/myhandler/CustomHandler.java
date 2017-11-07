package com.maliarenko.a2.myhandler;

import java.io.IOException;

public interface CustomHandler {
    void handle(int context) throws IOException;
}
