package com.gla.RegEx;

import java.util.regex.*;

public class LanguageExtractor {
    public static void main(String[] args) {

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        String regex = "\\b(Java|Python|JavaScript|Go|C|C\\+\\+|C#|Ruby|Swift|Kotlin)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted Languages:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}