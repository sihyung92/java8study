package com.sihyung;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo {
    public static void main(String[] args) {
        //Function 인데 입출력 타입이 같을 때 사용
        UnaryOperator<Integer> unaryOperator = (i) -> i + 10;

        //BiFunction 인데 <T,T,T> 인 상황에 사용
        BinaryOperator<Integer> binaryOperator = (i1, i2) -> i1 + i2 + 10;
    }
}
