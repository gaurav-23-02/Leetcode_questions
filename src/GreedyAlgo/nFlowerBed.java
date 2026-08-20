package GreedyAlgo;

public class nFlowerBed {
    public static boolean canPlace(int[]flowerbed,int n){
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i]==1&&flowerbed[i+1]==0){
                n--;
                flowerbed[i]=1;
            }
            else if(flowerbed[i]==0&&flowerbed[i+1]==0){
                n--;
            }
        }
        if(n==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[]flowerbed={1,0,0,0,0,0,1};
        int n=2;
        System.out.println(canPlace(flowerbed,n));
    }
}
