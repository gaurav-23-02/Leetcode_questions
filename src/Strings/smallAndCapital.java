package Strings;

public class smallAndCapital {
    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount==0){
            return 100;
        }
        if(purchaseAmount%10==1){
            return 100-purchaseAmount+1;
        }
        if(purchaseAmount%10==2){
            return 100-purchaseAmount+2;
        }
        if(purchaseAmount%10==3){
            return 100-purchaseAmount+3;
        }
        if(purchaseAmount%10==4){
            return 100-purchaseAmount+4;
        }
        if(purchaseAmount%10==5){
            return 100-purchaseAmount-5;
        }
        if(purchaseAmount%10==6){
            return 100-purchaseAmount-4;
        }
        if(purchaseAmount%10==7){
            return 100-purchaseAmount-3;
        }
        if(purchaseAmount%10==8){
            return 100-purchaseAmount-2;
        }
        if(purchaseAmount%10==9){
            return 100-purchaseAmount-1;
        }
        return 100-purchaseAmount;
    }

    public static void main(String[] args) {
        int purchaseAmount=11;
        System.out.println(accountBalanceAfterPurchase(purchaseAmount));
    }
}
