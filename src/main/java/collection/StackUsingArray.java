package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StackUsingArray {

    int[] arr;
    int size;
    int top;

    public StackUsingArray(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
       return size-1 == top;
    }

    public int valueAtPeek(){
        if(!isEmpty()){
            return arr[top];
        }else{
            System.out.println("Stack is empty.");
            return -1;
        }

    }

    public void push(int number){
        if(!isFull()) {
            top++;
            arr[top] = number;
            System.out.println("Pushed " + number + " at " + top + " position.");
        } else {
            System.out.println("Stack is full");
        }
    }

    public int pop(){
        if(!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Removed number "+returnedTop+" from position "+top);
            return arr[returnedTop];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public static void main(String[] args) {

        StackUsingArray stackUsingArray = new StackUsingArray(10);

        stackUsingArray.push(10);
        stackUsingArray.push(20);

        List<StackUsingArray> a = Arrays.asList(stackUsingArray);
        System.out.println(a);

    }
}
