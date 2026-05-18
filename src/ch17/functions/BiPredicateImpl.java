package ch17.functions;

import java.util.function.BiPredicate;

public class BiPredicateImpl {

    static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (text, length) -> text.length() == length;

        System.out.println(biPredicate.test("Fola", 4));
    }
}
