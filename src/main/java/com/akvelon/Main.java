package com.akvelon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dima", "Oleg", "Masha");
        System.out.println(names.stream()
                .filter(name -> name.toLowerCase().contains("Dima".toLowerCase()))
                .collect(Collectors.toList()));
    }


}
