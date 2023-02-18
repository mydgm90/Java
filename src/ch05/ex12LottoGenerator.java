package ch05;

import java.util.Arrays;
import java.util.Random;

public class ex12LottoGenerator {
    public static void main(String[] args) {
        int[] select = new int[6];
        int[] fball = new int[46];

        int cnt = 0;
        Random rd = new Random();
        while(cnt<6){
            int index = rd.nextInt(45);
            int sball = fball[index];
            if(sball==0){
                select[cnt]=index+1;
                fball[index]=-1;
                cnt++;
            }
        }
        Arrays.sort(select);
        System.out.println(Arrays.toString(select));
    }
}
