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
    private int intersectionSize;
    private long populationTime;
    private long intersectionTime;
    private Random r;

    public Model() {
        r = new Random();
        clearData();
    }

    public void intersection() {
        clearData();
        int sizeList, sizeHashSet;
        if (listAinHashSet) {
            sizeList = sizeListB;
            sizeHashSet = sizeListA;
        } else {
            sizeList = sizeListA;
            sizeHashSet = sizeListB;
        }
        long startTimePopulation = System.currentTimeMillis();
        // Fill List
        for (int i = 0; i < sizeList; i++)
            list.add(r.nextInt(Integer.MAX_VALUE));
        // Fill HashSet
        while (hashset.size() < sizeHashSet) {
            hashset.add(r.nextInt(Integer.MAX_VALUE));
        }
        populationTime = System.currentTimeMillis() - startTimePopulation;

        long startTimeIntersection = System.currentTimeMillis();
        for (Integer i : list)
            if (hashset.contains(i))
                intersectionSize++;
        intersectionTime = System.currentTimeMillis() - startTimeIntersection;
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

    public long getPopulationTime() {
        return populationTime;
    }

    public void setPopulationTime(long populationTime) {
        this.populationTime = populationTime;
    }

    public long getIntersectionTime() {
        return intersectionTime;
    }

    public void setIntersectionTime(long intersectionTime) {
        this.intersectionTime = intersectionTime;
    }

}
