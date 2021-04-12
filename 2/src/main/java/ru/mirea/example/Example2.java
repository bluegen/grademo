package ru.mirea.example;

import org.apache.commons.lang3.StringUtils;

public class Example2 {

    public static void main(String[] args) {
        String message = StringUtils.center(" Hello world ", 80, '*');
        System.out.println(message);
    }
}
