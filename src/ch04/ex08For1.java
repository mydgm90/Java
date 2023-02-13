package ch04;
import java.util.Scanner;
public class ex08For1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단 입력");

        int dan = sc.nextInt();

        for(int i = 1; i<=9; i++){
            System.out.println(dan + "*" + i + "=" + (dan*i)+"\t");
        }
    }
}
