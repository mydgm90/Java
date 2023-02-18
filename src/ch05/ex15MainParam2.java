package ch05;

public class ex15MainParam2 {
    public static void main(String[] args) {
        int num = args.length>0?Integer.parseInt(args[0]):5;
        int sum = 0;
        for(int i=1;   i<=100;   i++){
            if(i%num==0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
