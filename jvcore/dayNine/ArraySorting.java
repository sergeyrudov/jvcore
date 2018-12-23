package jvcore.jvcore.dayNine;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args){
        int[] data={10,-3,25, 4};
        swap(data,1,3);
        System.out.println(Arrays.toString(data));
    }
    public static void swap(int[]data, int i, int k){
        if(i!=k || i<data.length-1 ||k<data.length-1 ||data.length>=2){
            int temp = data[i];
            data[i]=data[k];
            data[k]=temp;
        }
    }
}
