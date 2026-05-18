package ch17.functions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerImpl {
    static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (text, length) -> {
            System.out.println(text+ " " + length);
        };

        Map<String, Integer> map = new HashMap<>();
        map.put("ONE", 3);
        map.put("TWO", 3);
        map.put("THREE", 4);

        map.forEach(biConsumer);
    }
}
