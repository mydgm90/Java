package ch03;

public class ex08ShortCircuit {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println((a+=10)>15|(b-=10)>15);      //앞연산과 뒷연산 모두 계산
        System.out.println("a="+a+", b="+b);

        a = 10;
        b = 20;
        System.out.println((a+=10)>15||(b-=10)>15);     //숏-서킷연산자로 인해 앞연산이 True이면 뒷연산은 생략
        System.out.println("a="+a+", b="+b);
    }
}
