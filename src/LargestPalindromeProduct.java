/*
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/


public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int number;
        int largestPalindrome = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                number = i * j;
                if (isPalindrome(number) && number > largestPalindrome) {
                    largestPalindrome = number;
                }
            }
        }
        System.out.println(largestPalindrome);
    }

    public static boolean isPalindrome(int number) {
        char[] numberToCheck = Integer.toString(number).toCharArray();
        String temp = "";
        for (int i = numberToCheck.length - 1; i >= 0; i--) {
            temp += numberToCheck[i];
        }
        return Integer.parseInt(temp) == number;
    }
}
