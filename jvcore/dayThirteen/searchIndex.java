package jvcore.jvcore.dayThirteen;

public class searchIndex {
    public static void main(String[] args){
        System.out.println(findElement(new double[]{1,8,5,20},6));
    }
    public static int findElement(double[]numbers, double el){
        if(numbers.length>0){
            for(int i =0;i<numbers.length;i++){
                if(numbers[i]==el){
                    return i;
                }
            }
        }



        return -1;
    }
}
