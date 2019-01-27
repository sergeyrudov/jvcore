package jvcore.jvcore.dayFiveteen;

public class Nasledovanie {
    public static void main(String[] args){
        Rectangle somename = new Rectangle(2, 4);
        System.out.println(somename.heihgt+"_"+somename.width);
        somename.setHeihgt(6);
        System.out.println(somename.getHeihgt());
        System.out.println(somename.area());
    }
}
