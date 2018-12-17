package jvcore.jvcore.daysix;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class BattleFieldTemplate extends JPanel {

    boolean COLORDED_MODE = true;

    int tankX = 0;
    int tankY = 0;

    long speed = 225;

    /**
     * Write your code here.
     */
    void runTheGame() throws Exception {
//        int i = 0;
//        int direction = 0;
//        while (true){
//            if(i<8 && direction==0){
//                tankX+=64;
//                i++;
//            }
//            else{
//                tankX-=64;
//                i--;
//            }
//            if(i==8){
//                direction=1;
//            }
//            else if (i==0){
//                direction=0;
//            }
//
//            repaint();
//            Thread.sleep(speed);
//        }
        moveToQuadrant("c","5");

    }

    void move(int direction) throws Exception {
        int step = 64;
        if((direction==1 && tankY==0) || (direction==2 && tankY==512) ||
                (direction==3 && tankX==0) || (direction==4 && tankX==512)){
            System.out.println("[Illegal move] direction:"+direction+" tankX:"+tankX+" tankY:"+tankY);
            return;
        }
        if (direction==1){
            tankY-=step;
            System.out.println("[Up move] direction:"+direction+" tankX:"+tankX+" tankY:"+tankY);
        }
        else if(direction==2){
            tankY+=step;
            System.out.println("[Down move] direction:"+direction+" tankX:"+tankX+" tankY:"+tankY);
        }
        else if(direction==3){
            tankX-=step;
            System.out.println("[Left move] direction:"+direction+" tankX:"+tankX+" tankY:"+tankY);
        }
        else {
            tankX+=step;
            System.out.println("[Right move] direction:"+direction+" tankX:"+tankX+" tankY:"+tankY);
        }
        repaint();
        Thread.sleep(speed);
    }
    void moveRandom() throws Exception {
        while (true) {
            Random r = new Random();
            int n = r.nextInt(5);
            if (n > 0) {
                move(n);
            }
        }
    }

    void moveToQuadrant( String v, String h) throws Exception{
        String coordinates = getQuadrant(v, h);
        int x = Integer.parseInt(coordinates.substring(0,coordinates.indexOf("_")));
        int y = Integer.parseInt(coordinates.substring(coordinates.indexOf("_")+1));
        if(tankX<x){
            while (tankX!=x){
                move(4);
            }
        }
        else {
            while (tankX!=x){
                move(3);
            }
        }
        if(tankY<y){
            while (tankY!=y){
                move(2);
            }
        }
        else {
            while (tankY!=y){
                move(1);
            }
        }

    }

    String getQuadrant( String v, String h){
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


    void myRandom() throws Exception{
        //создать переменную с запуском systemcurrenttime
        //перевести время в тип стринг
        //вырезать последнюю цифру
        //перевести последню цифру в тип int
        //проверить входил ли цифра в диапазон от 1 до 4
        //если входит то подавать на метод move
        //если не входит задать новую
        String a = "1234";


    }


    // Magic bellow. Do not worry about this now, you will understand everything in this course.
    // Please concentrate on your tasks only.

    final int BF_WIDTH = 595;
    final int BF_HEIGHT = 595;

    public static void main(String[] args) throws Exception {
        BattleFieldTemplate bf = new BattleFieldTemplate();
        bf.runTheGame();
    }

    public BattleFieldTemplate() throws Exception {
        JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
        frame.setLocation(500, 150);
        frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 22));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int i = 0;
        Color cc;
        for (int v = 0; v < 9; v++) {
            for (int h = 0; h < 9; h++) {
                if (COLORDED_MODE) {
                    if (i % 2 == 0) {
                        cc = new Color(252, 241, 177);
                    } else {
                        cc = new Color(233, 243, 255);
                    }
                } else {
                    cc = new Color(180, 180, 180);
                }
                i++;
                g.setColor(cc);
                g.fillRect(h * 64, v * 64, 64, 64);
            }
        }

        g.setColor(new Color(255, 0, 0));
        g.fillRect(tankX, tankY, 64, 64);
    }

}