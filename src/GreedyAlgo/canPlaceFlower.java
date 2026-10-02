package GreedyAlgo;

public class canPlaceFlower {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i-1]==0&&flowerbed[i+1]==0){
                flowerbed[i]=1;
                n--;
            }
        }
        if(n==0)return true;
        return false;
    }
    public static void main(String[] args) {
        int[]flowerbed = {1,0,0,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed,2));

    }
}
