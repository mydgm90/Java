package ch03;

public class ex04InfinityNan {
    public static void main(String[] args) {
        try {
            int i = 1/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        double d1 = 1/0.0;
        double d2 = 1%0.0;
        System.out.println(d1);
        System.out.println(d2);

        canUse(d1);
        canUse(d2);
    }

    public static void canUse(double d) {
        if(Double.isInfinite(d)||Double.isNaN(d)) {
            System.out.println("X");
        } else {
            System.out.println(d);
        }
    }
}
