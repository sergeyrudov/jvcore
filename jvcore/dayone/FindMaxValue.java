package dayone;

public class FindMaxValue {
    public static void main(String[] args){
        System.out.println(findmaxvalue(11,6,23,9));
    }

    public static int findmaxvalue(int a, int b, int c, int d){
        if(a>b && a>c && a>d){
            return a;
        }
        else if(b>c && b>d){
            return b;
        }
        else if(c>d){
            return c;
        }
        else{
            return d;
        }
    }
}
