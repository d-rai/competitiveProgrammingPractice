package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Simple {
    public static void main(String[] args) {
        String str = "Durgesh Kumar";

        Map<Character, Integer> value = findNumberOfOcc(str);
        for(Map.Entry<Character, Integer> m: value.entrySet()){
            if(m.getValue()>1){
                System.out.println(m.getKey()+":"+m.getValue());
            }
        }

    }

    private static Map<Character, Integer> findNumberOfOcc(String str) {
        Map<Character, Integer> temp = new LinkedHashMap<>();
        for(char ch: str.toCharArray()){
            if(temp.containsKey(ch)){
                temp.put(ch, temp.get(ch)+1);
            } else{
                temp.put(ch, 1);
            }
        }

        return temp;
    }
}
