package com.mkyong.examples;

public class MessageBuilder {

    public static String getHelloWorld(){
        return "hello world";
    }

    public static int getNumber10(){
        try {
            Thread.sleep(40000);
        } catch (Exception ex) {}
        return 10;
    }

}
