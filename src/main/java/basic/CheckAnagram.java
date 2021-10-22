package basic;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "test";
        String str2 = "ttse";
        if(areAnagram(str1,str2)){
            System.out.println("The two strings are anagram of each other");
        }else{
            System.out.println("The two strings are not anagram of each other");
        }
    }

    private static boolean areAnagram(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int n = ch1.length;
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < n; i++) {
            if(ch1[i] != ch2[i])
                return false;
        }
        return true;
    }
}
