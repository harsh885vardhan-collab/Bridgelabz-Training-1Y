package com.gla.RegEx;

public class UsernameValidator {

    public static boolean isValidUsername(String username) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return username.matches(regex);
    }

    public static void main(String[] args) {

        String[] testUsernames = {"user_123", "123user", "us"};

        for (String username : testUsernames) {
            if (isValidUsername(username)) {
                System.out.println(username + " → Valid");
            } else {
                System.out.println(username + " → Invalid");
            }
        }
    }
}