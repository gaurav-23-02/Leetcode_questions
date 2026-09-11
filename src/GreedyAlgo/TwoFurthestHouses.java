package GreedyAlgo;

public class TwoFurthestHouses {
    public static int maxDistance(int[] colors) {
        int max=0;
        for(int i=0;i<colors.length;i++){
            for(int j=i+1;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                    max=Math.max(max,j-i);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] colors={1,8,3,8,3};
        System.out.println(maxDistance(colors));
    }
}
