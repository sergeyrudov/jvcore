package dayone;


public class Time1 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis()/1000;
        int cp = 3600*24;
        System.out.print(time/cp+":");

        time = time%cp;
        cp = 3600;
        System.out.print(time/cp+":");

        time = time%cp;
        cp = 60;
        System.out.print(time/cp+":");

        System.out.println(time%cp);
    }
}
