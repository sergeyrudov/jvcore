package jvcore.jvcore.dayNine;

import java.util.Arrays;

public class ArraySwapElement {
    public static void main(String[] args) {
        int[] data = {10, 8, 6, 4};
        sort(data);
    }

    public static void swap(int[] data) {
        int buffer = 0;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i + 1]) {
                buffer = data[i];
                data[i] = data[i + 1];
                data[i + 1] = buffer;
            }
        }
    }
    public static void sort(int[]data){
        for(int i=0; i<data.length-1;i++){
            swap(data);
        }
        System.out.println(Arrays.toString(data));
    }
}




