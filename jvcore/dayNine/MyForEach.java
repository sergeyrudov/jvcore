package jvcore.jvcore.dayNine;

public class MyForEach {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        System.out.println(result(data));
    }

    public static double result(int[] data) {
        if (data.length > 0) {
            double sum = 0;
            for (int i : data) {
                sum += i;
            }
            return sum / data.length;
        }
        else {
            return -1;
        }
    }
}
