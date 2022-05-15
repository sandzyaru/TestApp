package com.example.testapp;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class MathTest {
    Math math;

    @Before
    public void setup(){
        math = new Math();
    }

    @Test
    public void simpleAdd(){
        assertEquals("4",math.add("2","2"));
    }
    @Test
    public void doubleAdd(){
        assertEquals("Enter an Integer",math.divide("2","2.0"));
    }

    @Test
    public void letterWithSpaceOrWithoutAdd(){
        assertEquals("Letters cannot be entered",math.add("2","a"));
    }

    @Test
    public void emptyAdd(){
        assertEquals("Empty",math.add("2",""));
    }
    @Test
    public void negativeAdd(){
        assertEquals("0",math.add("-2","2"));
    }
    @Test
    public void simpleDivide(){
        assertEquals("3",math.divide("6","2"));
    }

    @Test
    public void zeroDivide(){
        assertEquals("Can't divide by zero",math.divide("1","0"));
    }

    @Test
    public void evenDivide(){
        assertEquals("Comes out a non-integer", math.divide("5", "2"));
    }

    @After
    public void detach(){
        math = null;
    }
}
