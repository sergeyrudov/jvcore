package dayone;

public class Findtext {
    public static void main(String[] args) {
    String one = "Education is the most powerful weapon which you can use to change the world.";
    String two = "An investment in knowledge pay the best interest.";
    System.out.println(one.substring(one.indexOf("use"),one.indexOf("use")+"use".length())+' '+two.substring(17,26)+' '+one.substring(56));
    }
}