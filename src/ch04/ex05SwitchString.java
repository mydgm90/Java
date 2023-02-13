package ch04;

import java.util.Scanner;

public class ex05SwitchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Manager, Operator, People");

        String ls ="";
        String lv = sc.nextLine();

        switch (lv) {
            case"Manager":
                ls="A,B,C,D";
                break;
            case"Operator":
                ls="A,B,C";
                break;
            case"People":
                ls="A,B";
                break;
            default:
                ls="A";
        }
        System.out.println(ls);
    }
}
