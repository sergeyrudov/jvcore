package dayone;

public class Substring1 {
    public static void main(String[] args) {
    String stroka ="aI am failed ovrer and over afgain 6 in my life and that is my succeed";
    System.out.println(stroka.substring(0,4));
    System.out.println(stroka.substring(5));
    System.out.println(stroka.substring(stroka.indexOf("succeed")));
    System.out.println(stroka.replace("6","and"));
    System.out.println(System.currentTimeMillis());


}
}

