package mathProblem;

import java.util.HashMap;

public class leetcode_575 {
    public static int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<candyType.length;i++){
            map.put(candyType[i],map.getOrDefault(candyType[i],0)+1);
        }
        return Math.min(candyType.length/2,map.size());
    }

    public static void main(String[] args) {
        int[]candyType={1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
}
