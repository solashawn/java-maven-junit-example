package com.recursivechaos;

/**
 * Created by abell on 9/30/16.
 */
public class GreetingMaker {

    public String makeGreeting(String name) {
        String greeting = "";

        if (null != name){
            greeting = "Hello " + name;
        } else {
            greeting = "Hello world";
        }

        return greeting;
    }

}