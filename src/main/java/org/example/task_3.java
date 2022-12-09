package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task_3 {

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList( 1, 2, 3, 4, 5 );

        List<String> newList = list.stream().map(String::valueOf).collect(Collectors.toList());

        System.out.println(newList.toString());        // [1, 2, 3, 4, 5]
    }

}
