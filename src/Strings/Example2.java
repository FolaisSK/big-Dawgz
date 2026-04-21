package Strings;

import java.util.Arrays;
import java.util.List;

public class Example2 {
    static void main() {
        Character c = new Character('a');
        System.out.println();

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int number = numbers.get(0); // AutoUnboxing

        int num = 100;
        numbers.add(num); //AutoBoxing
    }


    public static void display(CharSequence text){
        System.out.println(text);
    }
}
