package com.robertotassone;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class Model {

    private int sizeListA;
    private int sizeListB;
    private boolean listAinHashSet;
    private LinkedList<Integer> list;
    private HashSet<Integer> hashset;
    private int MAX_INT_LIMIT = 100;

    public Model() {
        clearData();
    }

    public LinkedList<Integer> intersection() throws Exception {
        if (sizeListA <= 0 || sizeListB <= 0)
            throw new Exception("Sizes must be greater than zero.");
        if (list == null || list.isEmpty() || hashset == null || hashset.isEmpty())
            throw new Exception("Lists can not be empty.");
        LinkedList<Integer> intersection = new LinkedList<Integer>();
        for (Integer i : list)
            if (hashset.contains(i))
                intersection.add(i);
        return intersection;
    }

    private void clearData() {
        list = new LinkedList<Integer>();
        hashset = new HashSet<Integer>();
    }

    public void generateData() throws Exception {
        if (sizeListA <= 0 || sizeListB <= 0)
            throw new Exception("Sizes must be greater than zero.");
        clearData();
        Random r = new Random();
        if (listAinHashSet) {
            // Fill list B
            for (int i = 0; i < sizeListB; i++)
                list.add(r.nextInt(MAX_INT_LIMIT));
            // Fill list A (HashSet)
            for (int i = 0; i < sizeListA; i++)
                hashset.add(r.nextInt(MAX_INT_LIMIT));
        }
    }

    public int getSizeListA() {
        return sizeListA;
    }

    public void setSizeListA(int sizeListA) {
        this.sizeListA = sizeListA;
    }

    public int getSizeListB() {
        return sizeListB;
    }

    public void setSizeListB(int sizeListB) {
        this.sizeListB = sizeListB;
    }

    public boolean isListAinHashSet() {
        return listAinHashSet;
    }

    public void setListAinHashSet(boolean listAinHashSet) {
        this.listAinHashSet = listAinHashSet;
    }

}