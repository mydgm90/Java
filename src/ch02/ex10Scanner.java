package ch02;
import java.util.Scanner;
public class ex10Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input String");
        String line = sc.nextLine();
        System.out.printf("Input String:%s%n",line);

        System.out.println("Input Integer");
        int num1 = sc.nextInt();
        System.out.printf("Input Integer:%d%n",num1);

        System.out.println("Input Double");
        double num2 = sc.nextDouble();
        System.out.printf("Input Double:%f%n",num2);

        sc.close();

    }
}
