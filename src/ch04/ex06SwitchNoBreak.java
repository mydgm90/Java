package ch04;

import java.util.Scanner;

public class ex06SwitchNoBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Manager, Operator, People");

        String ls ="";
        String lv = sc.nextLine();

        switch (lv) {
            case"Manager":
                ls+="D";
            case"Operator":
                ls+="C";
            case"People":
                ls+="B";
            default:
                ls+="A";
        }
        System.out.println(ls);
    }
}
