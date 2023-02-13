package ch04;

import java.util.Random;

public class ex01IfElse {
    public static void main(String[] args) {
        String r = null;
        Random rd = new Random();

        System.out.println("L or S");
        int num1 = rd.nextInt(100);         //00~99 범위
        if(num1>=50){r = "L";}
        else {r = "S";}
        System.out.printf("%d is %s%n",num1,r);

        System.out.println("Dual");
        int num2 = rd.nextInt(10);
        if(num2%2==0) {r = "S";}
        else {r = "D";}
        System.out.printf("%d is %s%n",num2,r);

        r = (num2%2==0) ? "D" : "S";
        System.out.printf("%d is %s%n",num2,r);

    }
}
