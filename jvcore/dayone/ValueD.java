package dayone;

import java.util.Scanner;

public class ValueD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your value :");
        double value = input.nextDouble();
        String strValue = String.valueOf(value);
        System.out.println(strValue.substring(0,strValue.indexOf('.')));
        System.out.println(strValue.substring(strValue.indexOf('.')+1));
    }
}
