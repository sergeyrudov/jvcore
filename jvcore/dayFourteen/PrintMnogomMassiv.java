package jvcore.jvcore.dayFourteen;

import java.util.Arrays;

public class PrintMnogomMassiv  {
    public static void main(String[] args){
        String[][] data = {{"China", "Beijing", "13540000"},
                {"India", "New Deli", "12000000"},
                {"USA", "Washington", "10000000"},
                {"Indonezia", "Jakarta", "800000"},
                {"Brazil", "Brasilia", "6000000"},
                {"Pakistan", "Islambad", "500000"}};
  //      prinArray(data);
        print2(data);
    }

    public static void prinArray(String[][] data){
        for(int i =0;i<data.length; i++){
            System.out.println(Arrays.toString(data[i]));
        }
    }
    public static void print1(String[][] data){
        String str="";
        for(int i =0;i<data.length; i++){
            for(int y=0;y<data[i].length;y++){
                str+= data[i][y]+",";
            }
        }
        System.out.println(str);
    }
    public static void print2(String[][] data){
        for(int i =0;i<data.length; i++){
            System.out.print("[");
            for(int y=0;y<data[i].length;y++){
                System.out.print(data[i][y]);
                if(y<data[i].length-1){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
