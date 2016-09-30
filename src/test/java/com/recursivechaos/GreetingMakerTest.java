package com.recursivechaos;

//import org.junit.BeforeClass;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by abell on 9/30/16.
 */
public class GreetingMakerTest {

    GreetingMaker maker;

    @Before
    public void initGreetingMaker(){
        System.out.println("Setup GreetingMaker");
        maker = new GreetingMaker();
    }

    @Test
    public void testMakeGreeting() throws Exception {
        String input = "John";

        String output = maker.makeGreeting(input);

        assertEquals("Did not format String correctly", "Hello John", output);
    }

    @Test
    public void testMakeDefaultGreeting() throws Exception {

        String output = maker.makeGreeting(null);

        assertEquals("Did not use default greeting", "Hello world", output);
    }
}
