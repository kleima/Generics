package com.chrisdev;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String arg : args)
            stack.push(arg);
        while (!stack.isEmpty())
            System.out.println(stack.pop().toUpperCase());

        testMap("a", "b");
    }

    private static void testMap(String name, String iID) {
        HashMap<?, ?> map = new HashMap<>(){{
           put("name", name);
           put("7", iID);
        }};

       int i = map.size();
    }
}
