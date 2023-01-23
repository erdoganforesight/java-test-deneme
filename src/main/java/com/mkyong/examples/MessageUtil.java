package com.mkyong.examples;

import java.util.*;

public class MessageUtil {
  
  private Random rand = new Random();

  public static int getRandom(){
    try {
      Thread.sleep(100);
      return rand.nextInt(1,100);
    } catch (Exception ex) {}
        return 10;
  }
}
