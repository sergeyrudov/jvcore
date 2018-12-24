package jvcore.jvcore.dayTen;

import java.util.Arrays;

public class UniteMassive {
    public static void main(String[] args) {
        int[] data = {1, 2, 3};
        int[] data1 = {4, 5, 6, 7};
        unitedMassive(data,data1);
    }

    static void unitedMassive(int[] data, int[] data1) {
        int[] buffer = new int[data.length + data1.length];
        for (int i = 0; i < data.length; i++) {
            buffer[i] = data[i];
        }
        for (int i = 0; i < data1.length; i++) {
            buffer[data.length+i] = data1[i];
        }
        System.out.println(Arrays.toString(buffer));
    }
}
