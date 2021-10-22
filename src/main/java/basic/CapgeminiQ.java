package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CapgeminiQ {

        public static void main(String []args){
            String str = "Hello World";
            Map<Character, Integer> occuranceIs = occuranceOfChar(str);

            System.out.print(occuranceIs);

        }

        public static Map<Character, Integer> occuranceOfChar(String str){
            Map<Character, Integer> finalMap = new HashMap<Character, Integer>();


            for(char ch: str.toCharArray()){
                if(finalMap.containsKey(ch)){
                    finalMap.put(ch, finalMap.get(ch)+1);
                } else{
                    finalMap.put(ch, 1);
                }
            }
            return finalMap;

        }


}
