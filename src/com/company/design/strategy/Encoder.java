package com.company.design.strategy;

public class Encoder {
    private EncodingStrategy encodingStrategy;

    public String getMessmage(String message){
        return this.encodingStrategy.encode(message);
    }

    public void setEncodingStrategy(final EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }
}
