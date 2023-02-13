package ch04;
import java.util.Scanner;
public class ex04Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("권한입력(0,1,2,3,4)");
        int level = sc.nextInt();
        String ls = "";

        switch (level){
            case 0:
                ls="운영관리, 회원관리, 쓰기, 보기";
                break;
            case 1:
                ls="회원관리, 쓰기, 보기";
                break;
            case 2:
                ls="쓰기, 보기";
                break;
            default:
                ls="보기";
        }
        System.out.println(ls);
    }
}
