/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */


public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        int[] triplet = new int[3];
        for (int i = 1; i < 1_000 ; i++) {
            for (int j = 1; j < 1_000 ; j++) {
                for (int k = 1; k < 1_000 ; k++) {
                    if (isPythagorean(i,j,k) && i + j + k == 1_000){
                        triplet[0] = i;
                        triplet[1] = j;
                        triplet[2] = k;
                    }
                }
            }
        }
        System.out.print(triplet[0] + "\t");
        System.out.print(triplet[1] + "\t");
        System.out.print(triplet[2] + "\t");
    }

    public static boolean isPythagorean(int a,int b,int c){
        return (c > b && b > a) && (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2));
    }
}
