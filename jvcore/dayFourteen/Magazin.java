package jvcore.jvcore.dayFourteen;

import java.util.Arrays;

public class Magazin {
    static String[] birdsName = {"kanareyka","vorona", "soroka", "varabets"};
    static int[] birdsCost = {10, 30, 25, 60};
    static int[] birdsQuantity = {2,4,7,9};
    static int[] birdsSold = {0,0,0,0};

    public static void sell(String name, int num){
        int i=0;
        for(; i<birdsName.length;i++){
            if(name.equals(birdsName[i])){
                break;
            }
        }
        if(verifyQuantity(i,num)){
            System.out.println("was Sold "+birdsName[i]);
            birdsQuantity[i] -= num;
            birdsSold[i]+=num;
            System.out.println(Arrays.toString(birdsName));
            System.out.println(Arrays.toString(birdsCost));
            System.out.println(Arrays.toString(birdsQuantity));
            System.out.println(Arrays.toString(birdsSold));
        }
        else{
            System.out.println("Cannot sold");
        }
    }

    public static boolean verifyQuantity(int i, int num){
        if(birdsQuantity[i]>=num){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        sell("soroka", 8);
    }
}
