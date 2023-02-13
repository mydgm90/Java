package ch04;
import java.util.Scanner;
public class ex07DayMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Month 1 ~ 12");
        int month = sc.nextInt();
        int day = 0;

        switch (month){
            case 2:
                day=28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day=30;
                break;
            default:
                day=31;
        }
        System.out.printf("%d월은 %d일까지 있음",month,day);
        sc.close();
    }
}
