package org.example;
import java.util.ArrayList;
import java.util.List;

public class task_1 {
    public static double getAvg(List<Integer> nums) {
        int sum = 0, count = 0; double avg = 0;
        for (int i: nums) {
            if (i%5 == 0){
                sum += i;
                count++;
            }
        }
        avg = sum/count;
        return avg;
    }

    public static void main(String[] args) {

        //System.out.println("Hello world!");
        List<Integer> list = new ArrayList<>();
        int ss = 45;
        for (int i= 0; i < ss; i++) {
            list.add((int)(Math.random()*100));
        }
        double avg = getAvg(list);
        System.out.println(list);
        System.out.println("average = " + avg);
    }

}