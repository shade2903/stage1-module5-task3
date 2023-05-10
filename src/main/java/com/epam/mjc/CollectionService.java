package com.epam.mjc;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class  CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
       return list.stream().filter(e -> e %2 == 0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Comparator.naturalOrder()).stream().findAny();
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(f-> f.stream().min(Comparator.naturalOrder()).stream()).
                collect(Collectors.toList()).stream().min(Comparator.naturalOrder()).stream().findAny();


    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0,(acc, x) -> acc + x);
    }
}
