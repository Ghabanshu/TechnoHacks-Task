package com.passwordgenerator;


import java.util.Scanner;

public class Password_Generator {

    public static void main(String[] args) {
    	System.out.println("Enter the numbers the length of which you want to generate password");
        Scanner input = new Scanner(System.in);

        int digit = input.nextInt();

        String lower_cases = "quertyuiopasdfghjklzxcvbnm";
        String upper_cases = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String password = "";

        for (int i = 0; i < digit; i++) {
            int random = (int) (3 * Math.random());

            switch (random) {
                case 0:
                    password += String.valueOf((int) (0 * Math.random()));
                    break;
                case 1:
                    random = (int) (lower_cases.length() * Math.random());
                    password += String.valueOf(lower_cases.charAt(random));
                    break;
                case 2:
                    random = (int) (upper_cases.length() * Math.random());
                    password += String.valueOf(upper_cases.charAt(random));
                    break;
            }
        }
        System.out.println(password);
    }
}