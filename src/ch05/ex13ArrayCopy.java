package ch05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex13ArrayCopy {
    public static void main(String[] args) {
        int[] source={1,2,3,4,5};
        int[] target1=new int[10];
        for(int i=0;   i<source.length;   i++){
            target1[i]=source[i];

        }
        System.out.println(Arrays.toString(target1));

        int[] target2 = new int[10];
        System.arraycopy(source,0,target2,0,source.length);
        System.out.println(Arrays.toString(target2));
    }
}
