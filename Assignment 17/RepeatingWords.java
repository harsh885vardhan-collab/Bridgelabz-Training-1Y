package com.gla.RegEx;

import java.util.regex.*;
import java.util.*;

public class RepeatingWords {
    public static void main(String[] args) {

        String input = "This is is a repeated repeated word test.";

        String regex = "\\b(\\w+)\\b\\s+\\b\\1\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        Set<String> repeatedWords = new LinkedHashSet<>();

        while (matcher.find()) {
            repeatedWords.add(matcher.group(1));
        }

        System.out.println("Repeating words:");
        repeatedWords.forEach(System.out::println);
    }
}