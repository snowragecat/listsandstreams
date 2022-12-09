package org.example;
import java.util.ArrayList;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();

        people.add("Dima");
        people.add("Alexander");
        people.add("Katerin e");
        people.add("Samsonovovich");
        people.add("Alexander");
        people.add("Katerin e");
        people.add("Roxolana");
        people.add("fdkghepiajneklg");
        System.out.printf("ArrayList has %d elements \n", people.size());
        int count = 0, c = 0; boolean flag = true; String s = new String(); String ss = new String();
        //for (int i = 0; i < people.size()-1; i++){
            for (int j = 0; j < people.size(); j++){
                flag = true;
                s = people.get(j);
                System.out.println("j step  " + j + "           " + s);
                if (s.length() > 8){
                    for (int i = 0; i < people.size(); i++){
                        if (j == i) {
                            i++;
                        }
                        if (i == people.size()){
                            break;
                        }
                        ss = people.get(i);
                        if (s == ss) {
                            flag = false;

                        }
                        System.out.println("i step  " + i + "       " + flag + "           " + ss);
                    }
                    if (flag){
                        count++;
                    }
                }
            }
        //}
        Object[] peopleArray = people.toArray();
        for (Object person : peopleArray) {
            System.out.println(person);
        }
        System.out.println("count = " + count);

    }
}
