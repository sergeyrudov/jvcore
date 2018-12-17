package jvcore.jvcore.dayeight;

public class ArrayIndex {
    public static void main(String[] args){
        int[] data = {};
        System.out.println(getLast(data));

    }
    static int getLast(int[]data){
        if(data.length>0){
            return data[data.length-1];
        }
        else {
            return -1;
        }
    }
}
