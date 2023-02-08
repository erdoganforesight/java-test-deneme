package com.mkyong.examples;

import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDenemeBuilder {
    
     private Random random = new Random();

    @Test
    public void testGetHelloWorld() {
        assertEquals("hello world", MessageBuilder.getHelloWorld());
    }
  
  
    @Test
    public void testDeneme() {
        assertEquals("deneme", MessageBuilder.deneme());
    }
  
  
    @Test
    public void testGetNumber10() {
        assertEquals(10, MessageBuilder.getNumber10());
    }
  

}
