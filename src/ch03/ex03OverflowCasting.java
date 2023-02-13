package ch03;

public class ex03OverflowCasting {
    public static void main(String[] args) {

        int i1 = Integer.MAX_VALUE;
        int i2 = i1 + 1;
        System.out.println(i2);

        long l1 = i1 + 1;
        System.out.println(l1);

        long l2 = (long)(i1 + 1);
        System.out.println(l2);

        long l3 = (long)i1 + 1;
        System.out.println(l3);

    }
}
