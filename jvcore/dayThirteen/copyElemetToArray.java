package jvcore.jvcore.dayThirteen;

import java.util.Arrays;

public class copyElemetToArray {
    public static void main(String[] args) {
        int[]src={4,5};
        int[]dest={1,2,3,0,0,6,7};
        System.arraycopy(src,0,dest,3,2);
        System.out.println(Arrays.toString(dest));
        }
    }

