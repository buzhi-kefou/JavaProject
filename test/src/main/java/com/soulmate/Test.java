package com.soulmate;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class Test {

    private static class Father {

    }


    private static class Son extends Father {

    }


    public static void main(String[] args) throws NoSuchAlgorithmException {

    }

    public static void md5() throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        byte[] digest = md5.digest("12".getBytes(StandardCharsets.UTF_8));
        String hex = bytesToHex(digest);

        System.out.println(hex);
    }

    public static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}

