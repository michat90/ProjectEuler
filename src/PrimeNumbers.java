/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */

public class PrimeNumbers {
    public static void main(String[] args) {
        int primeCounter = 0;
        int number = 0;
        while (primeCounter < 10_001){
            number++;
            if (isPrimeNumber(number)){
                primeCounter += 1;
            }
        }
        System.out.println(number);
    }

    public static boolean isPrimeNumber(int number) {
        int factor = 0;
        for (int i = 2; i <= number ; i++) {
            if (number % i == 0){
                factor = i;
                break;
            }
        }
        return factor == number;
    }
}
