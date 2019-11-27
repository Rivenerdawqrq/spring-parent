package com.factory;

public class LFactory {
    private static L instance = new L();
    public static L createL(){
        return instance;
    }
    public L creates(){
        return instance;
    }
}
