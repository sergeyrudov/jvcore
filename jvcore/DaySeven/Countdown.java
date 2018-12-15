package jvcore.jvcore.DaySeven;

public class Countdown {
    public static void main(String[] args) throws Exception{
        countdown(5);
    }

    public static void countdown (int i) throws Exception{
        while (i>0){
            System.out.println(i=i-1);
            Thread.sleep(250);
        }
        System.out.println("Go!");
    }
}
