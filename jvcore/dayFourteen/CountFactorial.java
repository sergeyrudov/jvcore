package jvcore.jvcore.dayFourteen;

public class CountFactorial  {
    public static void main(String[] args){
        System.out.println(factorial(5));
    }

    public static long factorial(int i){
        if (i<= 1){
            return 1;
        }
        int result = i;
        if(i>1){
            result*=factorial(i-1);
        }
        return result;
    }
    }