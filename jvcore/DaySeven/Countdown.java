package jvcore.jvcore.DaySeven;

public class Countdown {
    public static void main(String[] args) throws Exception {
        countdown(6);
    }

    public static void countdown(int i) throws Exception {
        if (i > 0) {
            while (i > 1) {
                System.out.println(i = i - 1);
                Thread.sleep(1000);
            }
            System.out.println("Go!");
        } else {
            System.out.println("countdown has negative value "+i);
        }
    }
}
