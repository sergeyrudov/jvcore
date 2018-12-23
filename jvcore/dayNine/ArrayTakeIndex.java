package jvcore.jvcore.dayNine;

public class ArrayTakeIndex {
    public static void main(String[] args) {
//        int[] data = {1, 2, 3, 4, 5}; //сокращенный вариант
        calculate(new int[]{1, 2, 3, 4, 5}); //полный вариант
    }

    public static void calculate(int[] data) {
        if (data.length > 0) {
            long sum = 0;
            for (int i = 0; i < data.length; i++) {
                if (i % 2 == 1) {
                    sum += data[i];
                }
            }
            System.out.println(sum);
        }
        else {
            System.out.println(-1);
        }
    }
}
