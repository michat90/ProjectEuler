/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeFactor {
    public static void main(String[] args) {
        long largestFactor = 0;
        long number = 600851475143L;
        long factor = 1;
        while (number / factor != 1){
            factor = findFactor(number);
            if (factor == 0){
                break;
            }
            if (factor > largestFactor){
                largestFactor = factor;
            }
            number /= factor;
        }
        System.out.println(largestFactor);
    }
    public static long findFactor(long number){
        long factor = 0;
        for (long i = 2; i <= number ; i++) {
            if (number % i == 0){
                factor = i;
                break;
            }
        }
        return factor;
    }


}
