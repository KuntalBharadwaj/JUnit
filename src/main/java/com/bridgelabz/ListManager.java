package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class ListManager {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addElement(list,6);
        addElement(list,7);
        removeElement(list,0);
        System.out.println(getSize(list));
    }

    public static void addElement(List<Integer> list,int element) {
        list.add(element);
    }

    public static void removeElement(List<Integer> list, int i) {
        list.remove(i);
    }

    public static int getSize(List<Integer> list) {
        return(list.size());
    }
}
