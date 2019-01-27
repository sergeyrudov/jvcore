package jvcore.jvcore.dayFiveteen;


import jvcore.jvcore.dayTen.MnogomerniyMass;

public class DogTest {
    public static void main(String[] args){
        Dog sobaka = new Dog();
        Dog sobaka1 = new Dog("barsik",5, 8,true);
        System.out.println("Poroda: "+sobaka1.getPoroda());
        System.out.println(sobaka1.fatDog());
        MnogomerniyMass msaive = new MnogomerniyMass();
    }

}
