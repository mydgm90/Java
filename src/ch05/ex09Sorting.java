package ch05;

import java.util.Random;

public class ex09Sorting {
    public static void main(String[] args) {
        Random ran=new Random();
        int temp=0;
        int[] arr = new int[10];
        for(int i=0;   i<10;   i++) {arr[i]=ran.nextInt(100);}
        System.out.println("초기상태");

        for(int i:arr) {
            System.out.printf("%d\t",i);
        }

        for(int i=0;   i<arr.length-1;   i++) {
            for(int j=0;   j<arr.length-1; j++) {
                if (arr[j] > arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\n정렬후");
        for(int i:arr){
            System.out.printf("%d\t",i);
        }

    }
}
