package com.robertotassone;

import java.util.HashSet;
import java.util.LinkedList;

public class Model {

    private LinkedList<Integer> list1;
    private HashSet<Integer> list2;

    public LinkedList<Integer> intersection() {
        LinkedList<Integer> intersection = new LinkedList<Integer>();
        for (Integer i : list1)
            if (list2.contains(i))
                intersection.add(i);
        return intersection;
    }

    public LinkedList<Integer> getList1() {
        return list1;
    }

    public void setList1(LinkedList<Integer> list1) {
        this.list1 = list1;
    }

    public HashSet<Integer> getList2() {
        return list2;
    }

    public void setList2(HashSet<Integer> list2) {
        this.list2 = list2;
    }
}