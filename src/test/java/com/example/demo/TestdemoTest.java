package com.example.demo;

import org.junit.Test; 

import static org.junit.Assert.assertEquals;

public class TestdemoTest { 
     private Testdemo testdemo = new Testdemo(); 
 
     @Test 
     public void testHi() { 
          assertEquals("Hello world", testdemo.plus("Hello ", "world")); 
     } 
     @Test 
     public void testBye() { 
          assertEquals("Bye world", testdemo.plus("Bye", "world")); 
     } 
     @Test 
     public void testGood() { 
          assertEquals("Good world", testdemo.plus("Good",  "world")); 
     } 
     @Test 
     public void testBad() { 
          assertEquals("Bad world", testdemo.plus("Bad", "world")); 
     } 
} 