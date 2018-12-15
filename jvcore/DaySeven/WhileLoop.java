package jvcore.jvcore.DaySeven;

public class WhileLoop {
    public static void main(String[] args){
        loop(-6, 8);
    }

    static void loop(int i, int n){
            while (i<n) {
                n++;
                System.out.println(n);
                return;
            }
        }
    }