package jvcore.jvcore.dayeleven;

import java.util.Arrays;

public class stringArray {
    public static void main (String[] args){
        String[]output = {"Hello", "world", "Java"};
        String str = "абвгдеёжзи";
        String[]input = new String[output.length];
        for (int i=0;i<output.length;i++){
            input[i] = output[i];
        }
        System.out.println("input array "+Arrays.toString(input));
        System.out.println("output array "+Arrays.toString(output));
        one(str);
    }
    static void one(String str) {
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nСтрока до реверса: " + str);
        System.out.println("Строка в обратном порядке, после реверса: " + reverse);
    }
}


