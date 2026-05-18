package ch17.functions;

import java.util.function.BiFunction;

public class BiFunctionImpl {

    static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = (firstText, secondText) -> firstText.length()+secondText.length();

        System.out.println(biFunction.apply("Fola", "SK"));
    }
}
