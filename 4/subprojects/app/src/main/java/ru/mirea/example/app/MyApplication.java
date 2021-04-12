package ru.mirea.example.app;

import com.google.common.collect.ImmutableList;
import ru.mirea.example.lib.MyLibrary;

public final class MyApplication {

    public static void main(String[] args) {
        ImmutableList<String> greeting = MyLibrary.getGreeting();
        System.out.println(MyLibrary.createMessage(greeting));
    }
}
