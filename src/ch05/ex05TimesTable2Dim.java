package ch05;

public class ex05TimesTable2Dim {
    public static void main(String[] args) {

        int[][] gugu = new int[9][9];
        System.out.printf("gugu길이:%d%n",gugu.length);
        System.out.printf("gugu0길이:%d%n",gugu[0].length);


        for(int i=0; i<gugu.length;i++){
            for(int j=0; j<gugu[i].length;j++){
                gugu[i][j]=(i+1)*(j+1);
            }
        }

        for(int i=0;i<gugu.length;i++){
            for(int j=0;j<gugu[i].length; j++){
                System.out.printf("%d\t",gugu[i][j]);
            }
            System.out.println();
        }


    }


}
