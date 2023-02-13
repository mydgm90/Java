package ch03;

public class ex01ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println(10/3);
        System.out.println(10%3);

        byte b1 = 10;
        byte b2 = 20;
        int r1 = (b1 + b2);
        System.out.println(r1);

        int i1 = 100;
        long l1 = 200;
        int r2 = i1 + (int)l1;
        System.out.println(r2);

        System.out.println(10/3);
        System.out.println(10/3.0);
    }
}
