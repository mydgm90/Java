package ch02;

public class ex03Integer {
    public static void main(String[] args) {
        byte b1 = -128;
        System.out.println(b1);

        int i1 = 15;        //10진수
        int i2 = 0b1111;    // 2진수
        int i3 = 017;       // 8진수
        int i4 = 0xf;       //16진수
        System.out.println(i1+","+i2+","+i3+","+i4);

        int i5 = 1_000_000_000;
        System.out.println(i5);

        long l1 = 1_000_000_000L;
        System.out.println(l1);
    }
}
