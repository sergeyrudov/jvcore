package dayone;

public class StringComparsion {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "a";
        String d = new String("a");
        System.out.println(a==b); //сравнение ключей (ссылок)
        System.out.println(a==c);
        System.out.println(a==d);
        System.out.println(a.equals(d)); //сравнение значения переменной
    }
}
