package dayFour;

public class Coordinate {
    public static void main(String [] args){
        printCrdnt("c", "2");
    }
    public static String getQuadrant( String v, String h){
        int hor = Integer.parseInt(h);
        int ver =1;
        if(v.equals("b")){
            ver=2;
        }
        else if(v.equals("c")){
            ver=3;
        }
        else if(v.equals("d")){
            ver=4;
        }
        else if(v.equals("e")){
            ver=5;
        }
        else if(v.equals("f")){
            ver=6;
        }
        else if(v.equals("g")){
            ver=7;
        }
        else if(v.equals("h")){
            ver=8;
        }
        else if(v.equals("i")){
            ver=9;
        }
        return (hor*64-64)+"_"+(ver*64-64);
    }
    public static void printCrdnt(String v,String h){
        String coordinates=getQuadrant(v,h); //128_128px
        String x = coordinates.substring(0,coordinates.indexOf("_"));
        String y = coordinates.substring(coordinates.indexOf("_")+1);
        System.out.println(v+h+":("+y+"px,"+x+"px)");
    }
}
