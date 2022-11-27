/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all the numbers from 1 to 20?
 */


public class SmallestMultiple {
    public static void main(String[] args) {
        int counter = 0;
        long number = 0;
        while (counter < 20) {
            number++;
            counter = 0;
            for (int j = 1; j < 21; j++) {
                if (number % j == 0) {
                    counter += 1;
                }
            }
        }
        System.out.println(number);
    }
}
