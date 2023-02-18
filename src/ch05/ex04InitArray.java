package ch05;

public class ex04InitArray {
    public static void main(String[] args) {
        String[] str1 = new String[3];
        str1[0]="Hello";
        str1[1]="Java";
        str1[2]="World";

        String[] str2 = {"Hello","Java","World"};

        if (args.length==0){
            args=new String[]{"Hello","Java","World"};

        }

        for(int i=0; i<str1.length; i++){
            System.out.printf("str1:%s, str2:%s, arge:%s%n",str1[i],str2[i],args[i]);
        }
    }
}
