package Interviews;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test12Jan2024 {
    public static void main(String[] args) {




        Stream.iterate(new int[] {1, 3}, f -> new int[] {f[1], f[1]+2})
                .limit(10)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i+" "));

        System.out.println("");
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        Set<String> uniqueChars = new HashSet<>();
        Set<String> result =  Arrays.stream(inputString.split(""))
                .filter(ch -> ! uniqueChars.add(ch))
                .collect(Collectors.toSet());
        System.out.println(result);
    }
}
