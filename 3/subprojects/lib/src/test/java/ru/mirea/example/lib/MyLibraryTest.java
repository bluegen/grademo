package ru.mirea.example.lib;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyLibraryTest {

    @Test
    public void test() {
        String message = MyLibrary.createMessage(Arrays.asList("Hello", "world"));
        assertNotNull(message);
    }
}
