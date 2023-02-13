package ch03;

public class ex02IntegerProblem {
    public static void main(String[] args) {
        int r = addNormal(Integer.MAX_VALUE, 1);
        System.out.println(r);

        try {
            r = addSafety(100,100);
            System.out.println(r);
            r = addSafety(Integer.MAX_VALUE,100);
            System.out.println(r);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int addNormal(int base, int addThis){
        return base + addThis;
    }

    public static int addSafety(int base, int addThis){
        if((Integer.MAX_VALUE-addThis)>base){
            return base + addThis;
        } else {
            throw new ArithmeticException("OverFlow");
        }
    }
}
