package ch04;
import java.util.Scanner;
public class ex03NestedIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        System.out.println("나이입력");
        int age = sc.nextInt();

        System.out.println("보호자동반여부");
        boolean withParent = sc.nextBoolean();

        if(age>=12){
            result="관람가";
        } else {
            if(withParent) {
                result="보호자가능";
            } else {
                result="불가능";
            }
        }
        System.out.printf("age:%d,parent:&b,result:%s",age,withParent,result);
        sc.close();

    }
}
