package ru.mirea.example.lib;

import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;

public final class MyLibrary {

    public static ImmutableList<String> getGreeting() {
        return ImmutableList.of("Hello", "world");
    }

    public static String createMessage(Iterable<String> strings) {
        return StringUtils.center(" " + String.join(" ", strings) + " ", 80, '*');
    }
}
