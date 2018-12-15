package dayFour;

public class SpringTask {
    public static void main(String[] args){
        System.out.println(isSpringMonths(3));
    }
    public static int isSpringMonths(int month){
        if(month==3 || month==4 || month==5){
            return 1;
        }
        else if(month>=1 && month<=12){
            return 0;
        }
        else{
            return -1;
        }
    }
}
