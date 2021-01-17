package com.sihyung;

import java.util.function.Function;

public class Foo {
    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        // compose 안에 Function 먼저 실행 후 결과값으로 해당 Function 실행
        System.out.println(plus10.compose(multiply2).apply(10));
    }
}
