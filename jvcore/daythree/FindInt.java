package daythree;

import java.text.MessageFormat;
import java.util.Scanner;

public class FindInt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String value = input.next();
        char str = String.valueOf(value).charAt(0);
        String data = "Hello 1 if one the 2";
        for(int i=0; i<=data.length()-1; i=i+1) {
            if (data.charAt(i) == str) {
                System.out.println(MessageFormat.format("Is founded {0} at index {1}", data.charAt(i), i));
            }
            else {
                System.out.println("non found");
            }
        }
    }
}

//посмотреть вариант решения с булиан




