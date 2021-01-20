package com.sihyung;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo {
    public static void main(String[] args) {
        // 인자가 있는 생성자 참조
        String[] names = {"sihyung", "sujin", "love"};
        Arrays.sort(names, String::compareToIgnoreCase);
        Arrays.sort(names, ((o1, o2) -> 0));
    }
}
