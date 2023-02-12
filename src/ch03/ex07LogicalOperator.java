package ch03;

public class ex07LogicalOperator {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;

        System.out.printf("b1 & b2 : %b%n", b1 & b2);   //모두 True인 경우에만 True
        System.out.printf("b1 | b2 : %b%n", b1 | b2);   //하나라도 True인 경우 True
        System.out.printf("b1 ^ b2 : %b%n", b1 ^ b2);   //서로 다르면 True
        System.out.printf("b2 ^ b3 : %b%n", b2 ^ b3);   //서로 같으면 False
        System.out.printf("b1 : %b%n", !b1);            //부호를 반대로 바꿈
    }
}
