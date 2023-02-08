package com.mkyong.examples;

import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {
    
    private Random random = new Random();

    @Test
    public void testHelloWorld() {
        assertEquals("hello world", MessageBuilder.getHelloWorld());
    }

    @Test
    public void testNumber10() {
        try { Thread.sleep(1000*3);} catch(Exception ex) {}
        assertEquals(10, MessageBuilder.getNumber10());
        
    }
    

}
