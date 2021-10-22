package basic;

public class PalindromeCheck {
    public static void main(String[] args) {

        String str = "tat";
        if(isPalindrome(str)){
            System.out.println("String \""+str+"\" is Palindrome.");
        } else {
            System.out.println("String \""+str+"\" is not Palindrome.");
        }

        int num = 1211;
        if(isNumberPalindrome(num)){
            System.out.println("Number \""+num+"\" is Palindrome.");
        } else {
            System.out.println("Number \""+num+"\" is not Palindrome.");
        }

    }

    private static boolean isNumberPalindrome(int num) {
        int originalNum = num;
        int reversedNumber=0;
        int remainder;
        while (num > 0){
            remainder= num%10;
            reversedNumber = (reversedNumber*10)+remainder;
            num = num/10;
        }
        return reversedNumber==originalNum;
    }

    private static boolean isPalindrome(String str) {

        int i = 0, j = str.length()-1;
        while (i < j){
            if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }


}
