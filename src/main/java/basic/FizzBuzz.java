package basic;

public class FizzBuzz {
    /**
     * FizzBuzz. Print numbers from 1 to 100
     * - if a number is divisible by 3 print Fizz
     * - if a number is divisible by 5 print Buzz
     * - if a number is divisible by both 3 and 5 print FizzBuzz
     */

    public static void main(String[] args) {
        int n = 100;
        fizzBuzz(n);
    }

    private static void fizzBuzz(int n) {
        for (int i = 0; i <= n; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if(i%3==0){
                System.out.println("Fizz");
            } else if(i%5==0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
