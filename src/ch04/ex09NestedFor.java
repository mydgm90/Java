package ch04;

public class ex09NestedFor {
    public static void main(String[] args) {
        int i;
        int j;

        for(i=0; i<10; i++){
            for(j=0; j<10 && j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
