package com.gla.RegEx;

public class HexColorValidator {

    public static boolean isValidHex(String color) {
        String regex = "^#[0-9A-Fa-f]{6}$";
        return color.matches(regex);
    }

    public static void main(String[] args) {

        String[] testColors = {
                "#FFA500",
                "#ff4500",
                "#123",
                "#GGGGGG"
        };

        for (String color : testColors) {
            System.out.println(color + " → " +
                    (isValidHex(color) ? "Valid" : "Invalid"));
        }
    }
}