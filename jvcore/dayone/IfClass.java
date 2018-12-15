package dayone;

public class IfClass {
    public static void main(String[] args) {
//        String a ="test1";
//        if (a.equals("test")){
//            System.out.println("OK");
//        }
//        else{
//            System.out.println("No OK");
//        }
        System.out.println(oldEnough(21));
        System.out.println(oldEnough(15));
        System.out.println(mincomparsion(3,6,2));
        System.out.println(mincomparsion(0,0,-1));
    }
    public static boolean oldEnough(int age){
        if (age>=21){
            return true;
        }
        else{
            return false;
        }
    }
    public static int mincomparsion(int a, int b, int c){
        if (a<b && a<c){
            return a;
        }
        else if (b<c){
            return b;
        }
        else{
            return c;
        }
    }
}
//найти максимальное число из четырех параметров а б ц д