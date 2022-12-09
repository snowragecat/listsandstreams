package org.example;

import java.util.*;


public class task_4 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for(int i = 0; i < 7; i++){
            myList.add(i);
        }
        for (int i = 0; i < myList.size(); i++){
            System.out.print(myList.get(i));
        }

        /*String tString = myList.toString();
        for (Object myObject : tString) {
            System.out.print(myObject);
        }*/
    }
}
