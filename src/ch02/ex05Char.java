package ch02;

public class ex05Char {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = '\u0041';
        System.out.println(c1);
        System.out.println(c2);

        int i =c1 + 1;
        System.out.println(i);
        System.out.println((char)i);
    }
}
