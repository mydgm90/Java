package ch05;

import java.util.Random;

public class ex08IteratorFor {
    public static void main(String[] args) {
        int[] datas=new int[100];
        Random rd = new Random();
        for(int i = 0; i < datas.length; i++) {
            datas[i] = rd.nextInt(100);
        }

        int evenSum = 0;
        for(int i = 0; i < datas.length; i++) {
            int data = datas[i];
            if(data%2 == 0) {
                evenSum += data;
            }
        }
        System.out.printf("짝수합:%d%n",evenSum);

        int oddSum=0;
        for(int data:datas) {
            if(data%2 == 1){
                oddSum += data;
            }
        }
        System.out.printf("홀수합:%d%n",oddSum);
    }
}
