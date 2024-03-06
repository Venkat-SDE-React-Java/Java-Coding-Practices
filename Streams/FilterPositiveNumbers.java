package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPositiveNumbers {

//    Filter Positive Numbers:
//    Problem: Given a list of integers, use streams to filter out only the positive numbers and print them.
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> positiveList = list.stream().filter(integer -> integer > 0).collect(Collectors.toList());
        System.out.println(positiveList);
    }
}
