package ch17.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionImpl {
    static void main(String[] args) {
        Function<String, Integer> function = (text) -> text.length();

        System.out.println(function.apply("fghi"));

    }
}
