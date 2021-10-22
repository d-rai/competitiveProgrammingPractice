package basic;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapKeyValue {
    public static void main(String[] args) {
        Map<String, Integer> unsorted = new LinkedHashMap<>();
        unsorted.put("Jayant", 80);
        unsorted.put("Abhishek", 90);
        unsorted.put("Anushka", 80);
        unsorted.put("Amit", 75);
        unsorted.put("Danish", 40);

        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(unsorted);
        System.out.println(sorted);
        sorted.forEach((k, v) -> System.out.println(k +","+v));
    }
}
