package jvcore.jvcore.dayeight;

import sun.security.util.Length;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class MyOwnGenerator {
    public static void main(String[] args) {
        while (true) {
            long time = System.currentTimeMillis() / 1000;
            String a = String.valueOf(time);
            System.out.println(a);  //время до вырезания последего знака
            int b = Integer.parseInt(a.substring(a.length() - 1));
            System.out.println(b); //проверка промежуточного результата
            if (b >= 1 && b <= 4) {
                System.out.println("1-4");
            }
        }
    }
}
//создать переменную с запуском systemcurrenttime
//перевести время в тип стринг
//вырезать последнюю цифру
//перевести последню цифру в тип int
//проверить входил ли цифра в диапазон от 1 до 4
//если входит то подавать на метод move
//если не входит задать новую
