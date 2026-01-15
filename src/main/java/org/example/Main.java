package org.example;

public class Main {

    public static boolean isPalindrome(int number) {
        int original = Math.abs(number);
        int reverse = 0;
        int temp = original;

        while (temp > 0) {
            reverse = reverse * 10 + (temp % 10);
            temp /= 10;
        }

        return original == reverse;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }

        if (number == 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        String[] words = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        String numStr = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            result.append(words[digit]);
            if (i < numStr.length() - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
