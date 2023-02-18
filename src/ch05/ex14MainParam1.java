package ch05;

public class ex14MainParam1 {
    public static void main(String[] args) {
        int sum = 0;
        for(String arg:args){
            int num=Integer.parseInt(arg);
            sum = sum+num;
        }
        System.out.printf("배열길이:%d\t, 요소총합:%d",args.length,sum);
    }
}
