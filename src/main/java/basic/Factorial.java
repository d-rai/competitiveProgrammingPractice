package basic;



public class Factorial {
    public static void main(String[] args) {
        int n=3;
        //System.out.print(printFactorial(n));

        printFactorialDigit(n);
    }

    private static void printFactorialDigit(int n) {

        for (int i = n; i > 1; i--) {
            System.out.print(i+"*");
        }
        System.out.print("1");
    }

    private static int printFactorial(int n) {

        if(n<=2){
            return n;
        } else{
            return n*printFactorial(n-1);


        }
    }
}
