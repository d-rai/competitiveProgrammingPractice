package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class GlobalLogic {

    // number should be divisible by only 5 not 3
    public static void main(String[] args) {
        String str = "Durgesh  kumar";
        Map<Character, Integer> finalMap = printUniqueChar(str);

        //System.out.println(finalMap);

        finalMap.forEach((k,v) -> {
            if(v<2){
                System.out.print(k+" ");
            }
        });

    }

    private static Map<Character, Integer> printUniqueChar(String str) {
        Map<Character, Integer> newStr = new LinkedHashMap<>();
        for(char ch: str.toCharArray()){
            if(newStr.containsKey(ch)){
                newStr.put(ch, newStr.get(ch)+1);
            } else{
                newStr.put(ch, 1);
            }
        }
        return newStr;
    }
}
