package jvcore.jvcore.dayThirteen;

public class arrayValueReverse {
    public static void main (String[] args){
        System.out.println(inverse("Vasya"));
    }
    public static String inverse(String str){
        char[] chars = str.toCharArray();
        char temp;
        for(int i=0;i<chars.length/2;i++){
            temp = chars[i];
            chars[i]=chars[chars.length-1-i];
            chars[chars.length-1-i]=temp;
        }
        return new String(chars);
    }
}
