package dayone;

public class ReturnTest {
    public static void main(String[] args) {
        m1();
        System.out.println(m2(5));
        System.out.println(m3("Java"));
        System.out.println(m4(3,7));
        m5(5,2);
        m6(182);
    }
    public static void m1(){
        System.out.println("wfwef");
    }
    public static int m2(int symbol){
        return symbol;
    }
    public  static String m3(String name){
        return name+" Hello";
    }
    public  static int m4(int a, int b){
        return a+b;
    }
    public static void m5(int c, int d){
        System.out.println(c+d);
    }
    public static void m6(double f){
        System.out.println(f*f);
    }
}
