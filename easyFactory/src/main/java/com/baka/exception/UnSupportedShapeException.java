package com.baka.exception;

public class UnSupportedShapeException extends RuntimeException {
    public UnSupportedShapeException(){
    }

    public UnSupportedShapeException(String message){
        super(message);
    }
}
