public class NumberMultiples {
    public static void main(String[] args) {
        int sumOfMultiples = 0;
        for (int i = 1; i < 1000 ; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                sumOfMultiples += i;
            }
        }
        System.out.println(sumOfMultiples);
    }
}
