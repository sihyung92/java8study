package com.sihyung;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo {
    public static void main(String[] args) {
        // 생성자 참조
        Supplier<Greeting> newGreeting = Greeting::new;
        Greeting greeting = newGreeting.get();
        System.out.println(greeting.hello("hi"));
    }
}
