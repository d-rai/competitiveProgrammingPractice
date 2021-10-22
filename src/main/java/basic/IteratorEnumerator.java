package basic;

import java.util.*;

public class IteratorEnumerator {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(2);
        vector.add(5);
        vector.add(3);
        vector.add(6);
        Enumeration<Integer> enumeration = vector.elements();

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(2);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Enumeration<Integer> enumeration1 = (Enumeration<Integer>) list.listIterator();
        while (enumeration1.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
