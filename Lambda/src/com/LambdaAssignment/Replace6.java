package com.LambdaAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Replace every word in the list with its upper case equivalent. Use replaceAll() method & Unary Operator interface.
 */

public class Replace6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        Replace6 assignment4Q6 = new Replace6();
        System.out.println(assignment4Q6.convertToUpperCase(list));

    }
    public List<String> convertToUpperCase(List<String> list) {
        List<String> ToUpper = new ArrayList<>();
        Consumer<String> consumer = (str)->ToUpper.add(str.toUpperCase());

        list.stream()
                .forEach(consumer);

        return  ToUpper;
    }
}