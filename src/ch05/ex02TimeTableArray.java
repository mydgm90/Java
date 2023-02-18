package ch05;

public class ex02TimeTableArray {
    public static void main(String[] args) {
        int[] timesTable = new int[9];
        for(int i=0; i<timesTable.length; i++){
            timesTable[i]=3*(i+1);
        } System.out.println("Complete");

        int sum=0;
        for(int i=0;i<timesTable.length;i++){
            if (i % 2 == 0) {
                sum+=timesTable[i];
            }
        }
        System.out.printf("홀수합계:%d%n",sum);

    }
}
