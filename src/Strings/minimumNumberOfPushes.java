package Strings;

public class minimumNumberOfPushes {
    public static int minimumPushes(String s) {
        int push=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='x'||s.charAt(i)=='c'||s.charAt(i)=='e'||
                s.charAt(i)=='f'||s.charAt(i)=='g'||s.charAt(i)=='h'||s.charAt(i)=='i'||s.charAt(i)=='j'){
                push+=1;
            }
            else if(s.charAt(i)=='y'||s.charAt(i)=='d'||s.charAt(i)=='a'||s.charAt(i)=='k'||s.charAt(i)=='o'||s.charAt(i)=='r'||s.charAt(i)=='v'){
                push+=2;
            }
            else if(s.charAt(i)=='b'||s.charAt(i)=='l'||s.charAt(i)=='p'||s.charAt(i)=='s'||s.charAt(i)=='w'){
                push+=3;
            }
            else if(s.charAt(i)=='m'||s.charAt(i)=='q'||s.charAt(i)=='t'||s.charAt(i)=='z'){
                push+=4;
            }
            else if(s.charAt(i)=='n'||s.charAt(i)=='u'){
                push+=5;
            }
        }
        return push;
    }

    public static void main(String[] args) {
        String s = "xycdefghij";
        System.out.println(minimumPushes(s));
    }
}
