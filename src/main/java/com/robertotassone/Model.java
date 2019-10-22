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
    private int intersectionSize;
    private long computationTime;

    public Model() {
        clearData();
    }

    public void intersection() throws Exception {
        if (sizeListA <= 0 || sizeListB <= 0)
            throw new Exception("Sizes must be greater than zero.");
        clearData();

        long startTime = System.currentTimeMillis();
        Random r = new Random();
        if (listAinHashSet) {
            // Fill list B
            for (int i = 0; i < sizeListB; i++)
                list.add(r.nextInt(MAX_INT_LIMIT));
            // Fill list A (HashSet)
            for (int i = 0; i < sizeListA; i++)
                hashset.add(r.nextInt(MAX_INT_LIMIT));
        }
        else {
            // Fill list A
            for (int i = 0; i < sizeListA; i++)
                list.add(r.nextInt(MAX_INT_LIMIT));
            // Fill list B (HashSet)
            for (int i = 0; i < sizeListB; i++)
                hashset.add(r.nextInt(MAX_INT_LIMIT));
        }

        for (Integer i : list)
            if (hashset.contains(i))
                intersectionSize++;
        long endTime = System.currentTimeMillis();
        computationTime = endTime - startTime;
    }

    private void clearData() {
        list = new LinkedList<Integer>();
        hashset = new HashSet<Integer>();
        intersectionSize = 0;
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

    public int getIntersectionSize() {
        return intersectionSize;
    }

    public void setIntersectionSize(int intersectionSize) {
        this.intersectionSize = intersectionSize;
    }

    public long getComputationTime() {
        return computationTime;
    }

    public void setComputationTime(long computationTime) {
        this.computationTime = computationTime;
    }

}
