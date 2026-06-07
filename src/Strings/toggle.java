package Strings;
import java.util.*;;
public class toggle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        //toggle
        //PHysiCs------>phYSIcS
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch==' ') continue;
            boolean flag = true;// A=65 , a=97 , 0=48 ASCII value
            int asci =(int)ch;
            if(asci>=97)  flag =false;//small letter
            if (flag==true){
                asci+=32;
                char dh  =(char)asci;
                str.setCharAt(i,dh);
            }else{
                asci-=32;
                char dh =(char)asci;
                str.setCharAt(i,dh);
            }

        }
        System.out.println(str);
    }
}
