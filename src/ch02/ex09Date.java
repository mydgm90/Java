package ch02;
import java.util.Calendar; //달력 클래스
public class ex09Date {
    public static void main(String[] args) {
        Calendar curTime = Calendar.getInstance(); //메서드
        System.out.printf("%tA %<tB %<te %<tY %n",curTime);
        System.out.printf("%tD %n",curTime);
        System.out.printf("%tF %n",curTime);
        System.out.printf("%tc %n",curTime);
    }
}
