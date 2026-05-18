package ch17.stream;

import java.util.Set;

public class StreamCreator {
    static void main(String[] args) {
        Set<String> words = Set.of(
                "ONE",
                "TWO",
                "THREE",
                "FOUR"
        );

        words.stream()
                .toList();
    }
}
