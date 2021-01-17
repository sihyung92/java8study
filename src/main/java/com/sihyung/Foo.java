package com.sihyung;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Foo {
    public static void main(String[] args) {
        //BiFunction은 인자를 2개받음

        //Consumer 예제 i -> x
        Consumer<Integer> printT = (i) -> System.out.println(i);

        //Supplier 예제 x -> i
        Supplier<Integer> get10 = () -> 10;

        //Predicate 예제 x -> T/F
        Predicate<String> startsWithSihyung = (s) -> s.startsWith("Sihyung");
        // And, or, negate 등 조합 가능
        //startsWithSihyung.and(predicateB);
        //startsWithSihyung.or(predicateB);

    }
}
