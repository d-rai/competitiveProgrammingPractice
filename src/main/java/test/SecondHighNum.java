package test;

import java.util.Iterator;
import java.util.Stack;

public class SecondHighNum {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        int num =2;
        System.out.println(secondHigh(array, num));
    }

    private static int secondHigh(int[] array, int num) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < num; i++) {
            int high = array[0];
            for (int j = 1; j < array.length; j++) {
                if(array[j] > high){
                    if(stack.isEmpty()){
                        high = array[j];
                    }
                    if(!stack.isEmpty()){

                        Iterator value = stack.iterator();

                        while (value.hasNext()) {
                            int temp = (int) value.next();
                            if(temp!=array[j]){
                                high = array[j];
                            }
                        }
                    }

                }
            }
            stack.add(i,high);

        }
        //System.out.println(stack);

        return stack.get(num-1);

    }

    private static int secondHigh1(int[] array, int num) {

        int[] a = new int[2];
        int high = array[0];
        //Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < array.length; i++) {
            if(array[i] > high){
                high = array[i];
            }
        }

        a[0] = high;

        high = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] > high && array[i] != a[0]){
                high = array[i];
            }
        }

        a[1] = high;




        return a[1];

    }

}
