package basic;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CreateMapOfLetterAndOccurrence {
    public static void main(String[] args) {
        String str = "Duregesh Kumar";
        Map<Character, Integer> mapping = createMapOfOccurrenceOfLetter(str);

        for(Map.Entry<Character, Integer> entry: mapping.entrySet()){
            System.out.print("("+entry.getKey()+", "+entry.getValue()+")");
        }
    }

    private static Map<Character, Integer> createMapOfOccurrenceOfLetter(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();


        for(char ch: str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            } else{
                map.put(ch, 1);
            }
        }
        return map;
    }
}
