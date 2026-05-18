package ch17.functions;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierImpl {
    static void main(String[] args) {
        Supplier<Integer> supplier = () -> {
            return new Random().nextInt(1,100);
        };

        System.out.println(supplier.get());

        Stream.generate(supplier)
                .limit(10)
                .forEach((x -> System.out.println(x)));
    }
}
