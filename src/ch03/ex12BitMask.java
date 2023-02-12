package ch03;

public class ex12BitMask {
    public static void main(String[] args) {
        int homeElecStatus = 0;
        int tvCheck = 0b1;
        String result ="";
        result = (homeElecStatus&tvCheck)>0?"On":"Off";
        System.out.println("Tv Status:"+result);

        homeElecStatus|=tvCheck;
        result = (homeElecStatus&tvCheck)>0?"On":"Off";
        System.out.println("Tv Status:"+result);

        homeElecStatus^=tvCheck;
        result = (homeElecStatus&tvCheck)>0?"On":"Off";
        System.out.println("Tv Status:"+result);

        homeElecStatus&=~tvCheck;
        result = (homeElecStatus&tvCheck)>0?"On":"Off";
        System.out.println("Tv Status:"+result);


    }
}
