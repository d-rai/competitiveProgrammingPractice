package basic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "DurgeshDurgesh";
        System.out.println(removeDuplicate(str));
        System.out.println(removeDuplicateUsingSet(str));
    }

    private static String removeDuplicateUsingSet(String str) {
        String withoutDuplicate="";
        Set<Character> set = new LinkedHashSet<>();
        for(char ch: str.toCharArray()){
            set.add(ch);
        }

        for (char ch: set){
            withoutDuplicate +=ch;
        }
        return withoutDuplicate;
    }

    private static String removeDuplicate(String str) {
        String withoutDuplicate ="";

        for(char ch: str.toCharArray()){
            if(!withoutDuplicate.contains(String.valueOf(ch)))
                withoutDuplicate += ch;
        }
        return withoutDuplicate;
    }
}
