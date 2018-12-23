package jvcore.jvcore.dayNine;

import java.util.Arrays;

public class ArraySwapElement {
    public static void main(String[] args) {
        int[] data = {10, 8, 6, 4};
        swap(data);
        System.out.println(Arrays.toString(data));
    }

    public static void swap(int[] data) {
        boolean isSorted = false;
        int buf = 0;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < data.length-1; i++) {
                if(data[i] > data[i+1]){
                    isSorted = false;

                    buf = data[i];
                    data[i] = data[i+1];
                    data[i+1] = buf;
                }
            }
        }
    }
}
