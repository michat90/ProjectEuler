/*
The sum of the squares of the first ten natural numbers is,

The square of the sum of the first ten natural numbers is,

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */


public class SumSquareDifference {
    public static void main(String[] args) {
        System.out.println(squareOfTheSum(100) - sumOfTheSqueres(100));
    }

    public static int sumOfTheSqueres(int range) {
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public static int squareOfTheSum(int range){
        int sum = 0;
        for (int i = 1; i <= range ; i++) {
            sum += i;
        }
        return (int)Math.pow(sum,2);
    }

}
