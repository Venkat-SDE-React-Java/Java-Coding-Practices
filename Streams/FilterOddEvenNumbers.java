package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOddEvenNumbers {

//    Filter Positive Numbers:
//    Problem: Given a list of integers, use streams to filter out only the positive numbers and print them.
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println("Even List " + list.stream().filter(
                integer -> (integer % 2) == 0).collect(Collectors.toList()));
        System.out.println("Odd List " + list.stream().filter(
                integer -> (integer % 2) != 0).collect(Collectors.toList()));
    }
}
