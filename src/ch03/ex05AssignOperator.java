package ch03;

public class ex05AssignOperator {
    public static void main(String[] args) {
        //변수 i1에 파라메터 값이 누적
        int i1 = 10;

        i1 += 20;
        System.out.println(i1);
        i1 -= 10;
        System.out.println(i1);
        i1 *= 10;
        System.out.println(i1);
        i1 /= 10;
        System.out.println(i1);
        i1 %= 20;
        System.out.println(i1);
    }
}
