package jvcore.jvcore.dayFiveteen;

public class Rectangle {
    public double width = 1;
    public double heihgt = 1;



    public Rectangle(){

    }


    public Rectangle(double newWidth, double newHeight){
        width = newWidth;
        heihgt = newHeight;
    }

    public double getHeihgt() {
        return heihgt;
    }

    public double getWidth() {
        return width;
    }

    public void setHeihgt(double heihgt) {
        this.heihgt = heihgt;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double area(){
        return width*heihgt;
    }
}
