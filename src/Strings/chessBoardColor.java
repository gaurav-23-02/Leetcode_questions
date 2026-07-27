package Strings;

public class chessBoardColor {
    public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char a = coordinate1.charAt(0);
        char b = coordinate2.charAt(0);
        int n1 = coordinate1.charAt(1)-'0';
        int n2 = coordinate2.charAt(1)-'0';
        int x=0;
        int y=0;
        if(a=='a'){
            x=1;
        }
        else if(a=='b'){
            x=2;
        }
        else if(a=='c'){
            x=3;
        }
        else if(a=='d'){
            x=4;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(checkTwoChessboards("a1","h3"));
    }
}
