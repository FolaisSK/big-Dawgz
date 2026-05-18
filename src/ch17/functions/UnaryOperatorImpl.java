package ch17.functions;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorImpl {

    static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (text) -> text.toUpperCase();
        System.out.println(unaryOperator.apply("Fola"));

    }
}
