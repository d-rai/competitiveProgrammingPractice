package basic;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        findFibonacci(n);

    }



    private static void findFibonacci(int n) {
       int f1=0, f2=1;
        if (n<1){
           return;
       }

        System.out.print(f1+" ");

        for (int i = 1; i < n; i++) {
            System.out.print(f2+" ");
            int next = f1+f2;
            f1=f2;
            f2=next;

        }
    }
}
