package com.gla.RegEx;

public class IPValidator {

    public static boolean isValidIP(String ip) {
        String regex = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}" +
                "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";
        return ip.matches(regex);
    }

    public static void main(String[] args) {

        String[] testIPs = {
                "192.168.1.1",
                "255.255.255.255",
                "256.100.50.0",
                "192.168.1",
                "123.045.067.089"
        };

        for (String ip : testIPs) {
            System.out.println(ip + " → " +
                    (isValidIP(ip) ? "Valid" : "Invalid"));
        }
    }
}