package Exercises;

public class Exercise512 {
    public static void main(String[] args) {
        int i;
        int product = 1;
        for(i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                product *= i;
                System.out.println(product);
            }
        }


    }
}
