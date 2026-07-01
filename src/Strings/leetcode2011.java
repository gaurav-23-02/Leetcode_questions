package Strings;

public class leetcode2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int start=0;
        for(int i=0;i<operations.length;i++){
            String a=operations[i];
            if(a.contains('+'+"")){
                start++;
            }
            else{
                start--;
            }
        }
        return start;

    }

    public static void main(String[] args) {
        String[]operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }


}
