package ch03;

public class ex06CompareOperator {
    public static void main(String[] args) {
        System.out.println('A'>'B');
        System.out.println('A'==65);                                    //Char타입 비교시 유니코드로 자동변환되어 True
        System.out.println(3==3.0);

        System.out.println(0.1+":"+0.1f+":"+(0.1==0.1f));               //Float타입 부동소수점 차이로 False
        System.out.println(0.5+":"+0.5f+":"+(0.5==0.5f));               //Float타입 부동소수점 차이로 False

        double d1 = 0.1f;
        float f1 = 0.1f;
        System.out.println((int)(d1*10)==(int)(f1*10));                 //모두 동일한 타입으로 캐스팅되어 True
        System.out.println((float)d1==f1);                              //비교대상과 동일한 타입으로 캐스팅되어 True

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println((s1==s2)+":"+s1.equals(s2));                 //객체참조이므로 연산자는 False, 메서드는 True

    }
}
