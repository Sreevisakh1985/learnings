package com.sree;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int a, b;
        int sum = 10 + 2;
        System.out.println("Hello I am back to Java again ");
        check_maps();
        new Main().create_passwords();
        // write your code here
    }

    private static int check_maps() {
        Map<Integer, Integer> customMap = new HashMap<>();
        customMap.put(123, 1232);
        System.out.println(customMap);
        return 1;
    }

    private void create_passwords() {
        String numbers = "0123456789";
        String lowerCaseCharacters = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharaters = "@#$%";
        int minimumLength = 5;
        int maxLength = 10;
        StringBuilder password = new StringBuilder();
        Random r = new Random();
        String baseString = numbers + lowerCaseCharacters + upperCaseCharacters + specialCharaters;
        int i = 0;
        while (i < maxLength) {
            password.append(baseString.charAt(r.nextInt(baseString.length() - 1)));
            i++;
        }
        System.out.println(password);

    }

}
