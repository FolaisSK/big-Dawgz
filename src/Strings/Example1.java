package Strings;

public class Example1 {
    public static void main(String[] args) {
        CharSequence charSequence = "Hello World";
        CharSequence charSequence2 = new String("Hi world");
        CharSequence charSequence3 = new StringBuilder("12345667");
        CharSequence charSequence4 = new StringBuffer("1234456689");

        display(charSequence);
        display(charSequence2);
        display(charSequence3);
        display(charSequence4);
    }


    public static void display(CharSequence text){
        System.out.println(text);
    }
}
