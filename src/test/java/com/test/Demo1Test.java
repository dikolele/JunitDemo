package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.demo.Demo1;

public class Demo1Test {

    private static Demo1 demo = new Demo1();
    
    @Before
    public void setUp() throws Exception {
    	demo.clear();
    }

    @Test
    public void testAdd() {
    	demo.add(2);
    	demo.add(3);
        assertEquals(5, demo.getResult());
    }

    @Test
    public void testSubstract() {
    	demo.add(10);
    	demo.substract(2);
        assertEquals(8, demo.getResult());
    }

    @Ignore("Multiply() Not yet implemented")
    @Test
    public void testMultiply() {
    }

    @Test
    public void testDivide() {
    	demo.add(8);
    	demo.divide(2);
        assertEquals(4, demo.getResult());
    }
}