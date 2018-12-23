package jvcore.jvcore.dayNine;

import java.util.Arrays;

public class MyPrintArray {
    public static void main(String[] args) {
        int[] data = {10, 4, 25, -3};
        print(data);
    }

    public static void print(int[] data) {
//        System.out.println(Arrays.toString(data));
        int i=0;
        System.out.print("[");
        while(i<data.length){
            System.out.print(data[i++]);
            if(i<data.length){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
