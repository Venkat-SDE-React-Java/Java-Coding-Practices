package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUpperCaseConvert {

    public static void main(String[] args){

        List<String> list = Arrays.asList("Jack", "Jones", "Jill", "Jamie");

        System.out.println("Uppercase " + list.stream().map(String::toUpperCase).collect(Collectors.toList()));
    }
}
