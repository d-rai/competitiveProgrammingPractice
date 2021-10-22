package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class CompareListData {
    public static void main(String[] args) {
        List<Integer> listExp = new ArrayList<>();
        listExp.add(23);
        listExp.add(2);
        listExp.add(3);
        listExp.add(22);
        listExp.add(33);

        List<Integer> listAct = new ArrayList<>();
        listExp.add(23);
        listExp.add(2);
        listExp.add(76);
        listExp.add(3);
        listExp.add(22);
        listExp.add(33);

    }




}
