package ch05;

public class ex01SimpleArray {
    public static void main(String[] args) {
        int[] points = new int[3];
        System.out.printf("배열크기:%d%n",points.length);

        points[0]=1;
        points[1]='A';
        System.out.printf("배열0:%d%n",points[0]);
        System.out.printf("배열1:%d%n",points[1]);

    }
}
