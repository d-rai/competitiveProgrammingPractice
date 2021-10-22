package basic;

public class FindElementsInArrayWhoseSumIsGivenSum {

    public static void main(String[] args) {
        int givenSum = 5;
        int[] arr={1,3,2,4,6,7,8,9};

        //simpleSolution(arr, givenSum);
        int[] b= findIndex(arr, givenSum);

        for (int i = 0; i <2 ; i++) {
            System.out.print(b[i]+" ");
        }
    }

    private static int[] findIndex(int[] arr, int givenSum) {
        int[]  a = new int[2];
        for(int i=0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if (arr[i] + arr[j] == givenSum){
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return a;
    }

    private static void simpleSolution(int[] arr, int givenSum) {
        int[] numbers = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==givenSum){
                    numbers[0]=arr[i];
                    numbers[1]=arr[j];
                }

            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
