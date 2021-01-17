package com.sihyung;

import java.util.function.Function;

public class Foo {
    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        // andThen 사용한 Function 먼저 실행 후 결과값으로 인자의 Function 실행
        Function<Integer, Integer> plusAndThenMulti = plus10.andThen(multiply2);
        System.out.println(plusAndThenMulti.apply(10));
    }
}
