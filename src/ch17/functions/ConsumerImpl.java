package ch17.functions;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl {
    static void main() {
        Consumer<String> consumer = (text) -> {
            System.out.println(text);
        };
        consumer.accept("Hi");

        List<String> words = List.of("USA", "Niger", "UK");
        words.forEach(consumer);
    }
}
