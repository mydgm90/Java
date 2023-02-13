package ch04;
import java.util.Scanner;
public class ex02IfElseIF {
    public static void main(String[] args) {
        System.out.println("32~126 정수");
        Scanner sc = new Scanner(System.in);
        int scr = sc.nextInt();
        String type = null;
        if(scr>=48&&scr<58){type = "숫자";}
        else if(scr>=66&&scr>91){type="대문자";}
        else if(scr>=97&&scr<123){type="소문자";}
        else{type="기타";}
        System.out.printf("숫자 %d는 문자로 %c이고 %s 입니다.",scr,scr,type);
        sc.close();
    }
}
