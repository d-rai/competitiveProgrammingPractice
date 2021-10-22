package basic;

import java.util.*;

public class LengthCal {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Durgesh", 1);
        map.put("DK", 2);
        map.put("SK", 3);
        map.put("PK", 4);
        map.put("MK", 5);

        System.out.println(map.size());

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list.size());

        int[] arr = {2,4,3,5};
        System.out.println(arr.length);

        String str = "DurgeshKumar";
        System.out.println(str.length());

        char[] ch = str.toCharArray();
        System.out.println(ch.length);

        Stack<Integer> stack = new Stack<>();
        stack.push(21);
        stack.push(10);
        System.out.println(stack.size());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(21);
        linkedList.add(22);
        linkedList.add(23);
        System.out.println(linkedList.size());
        System.out.println(linkedList);

    }
}
