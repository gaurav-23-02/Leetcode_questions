package array;

public class flowerBed {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int oneCount=0;
        int zeroCount=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                zeroCount++;
            }else{
                oneCount++;
            }
        }
        System.out.println(oneCount);
        System.out.println(zeroCount);
        int m=oneCount+n;
        if(flowerbed[0]==1){
            if(m-zeroCount>=0){
                return true;
            }else{
                return false;
            }
        }
        else{
            if(zeroCount-m>=0){
                return true;
            }else{
                return false;
            }
        }


    }

    public static void main(String[] args) {
        int[]flowerbed = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed,2));

    }
}
