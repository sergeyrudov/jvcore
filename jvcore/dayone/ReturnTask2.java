package dayone;

public class ReturnTask2 {
    public static void main(String[] args) {
        System.out.println(square(2.5, 6.1));
        System.out.println(square(7));
        System.out.println(square(12l));
        System.out.println(square(7.9));
    }

    public static double square(double n) {
        System.out.print("#double: ");
        return n*n;

    }
    public static int square(int n) {
        System.out.print("#int: ");
        return n*n;

    }
    public static long square(long n) {
        System.out.print("#long: ");
        return n*n;

    }
    public static double square(double n1,double n2) {
        System.out.print("#double2: ");
        return n1*n2;

    }
}
