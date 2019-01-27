package jvcore.jvcore.dayFiveteen;

public class Dog {
    String poroda = "chau-chau";
    double ves = 20;
    int vozrast = 3;
    boolean smallDog = true;


    public Dog(){

    }
    public Dog(String newPoroda, double newVes, int newVozrast, boolean newSmallDog){
        poroda = newPoroda;
        ves = newVes;
        vozrast = newVozrast;
        smallDog = newSmallDog;
    }

    public double getVes() {
        return ves;
    }

    public int getVozrast() {
        return vozrast;
    }

    public String getPoroda() {
        return poroda;
    }

    public boolean isSmallDog() {
        return smallDog;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }

    public void setVozrast(int vozrast) {
        this.vozrast = vozrast;
    }

    public void setSmallDog(boolean smallDog) {
        this.smallDog = smallDog;
    }
    public String fatDog(){
        if(smallDog){
            if(ves<3){
                return "Sick dog";
            }
            else if(ves>=3 && ves<=5){
                return "Normal dog";
            }
            else{
                return "Fat dog";
            }
        }
        else{
            if(ves<15){
                return "Sick dog";
            }
            else if(ves<=20 && ves <=25){
                return "Normal dog";
            }
            else{
                return "Fat dog";
            }
        }
    }
}
