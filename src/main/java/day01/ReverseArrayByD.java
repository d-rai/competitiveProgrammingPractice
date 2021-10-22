package day01;

public class ReverseArrayByD {

    public static void main(String[] args) {
        int[] a = {23,1,2,3};
        int d = 9;
        leftRotateByD(a,d);
    }

    private static void leftRotateByD(int[] a, int d) {
        int n = a.length;

        /**
         * If d is equal to zero or equal to total number of array element
         * in that case there will no change in actual array and reversed array
         */
        if(d==0 | d==n) {
            printFinalArray(a);
            return;
        }

        /**
         * If value of d is greater than total number of array element
         * in that case same sequence will repeat again and again.
         *
         */
        if(d>n){
            d = d%n;
        }


        reverse(a,0,d-1);
        reverse(a,d,n-1);
        reverse(a,0,n-1);
        printFinalArray(a);
    }

    private static void printFinalArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    private static void reverse(int[] a, int start, int end) {

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end]= temp;
            start++;
            end--;
        }
    }
}
