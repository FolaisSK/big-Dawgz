package ch17.functions;

import java.util.function.BinaryOperator;

public class BinaryOperatorImpl {

    static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (first, second) -> first+second;

        System.out.println(binaryOperator.apply("Fola", "jimi"));
    }
}
