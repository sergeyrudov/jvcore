package jvcore.jvcore.dayeleven;

public class arrayE {
    public static void main(String[] args){
        int[][]data = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i=0;i<data.length;i++){
            System.out.println(data[1][0]); // 4 4 4
            System.out.println(data.length); //3 3 3
        }
    }
}
