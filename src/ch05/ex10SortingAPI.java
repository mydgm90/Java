package ch05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex10SortingAPI {
    public static void main(String[] args) {
        String[] arr={"Java","is","A","PIE"};
        Arrays.sort(arr);
        System.out.println("정렬 후");
        for(String i:arr){
            System.out.printf("%s\t",i);
        }
    }
}
