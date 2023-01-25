package midJan;
import java.util.*;
public class question_4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total amount of money");
        int amount = sc.nextInt();
        int[] coins = {10,5,2,1};
        System.out.println("enter number of coins for each denominations");
        int[] noOfCoins = new int[4];
        for (int i = 0; i < 4; i++) {
        	System.out.println(coins[i]);
            noOfCoins[i] = sc.nextInt();
        }
        denomination(coins,noOfCoins,amount);
    }
    public static void denomination(int[] coins,int[] noOfCoin,int amount){
        int i = 0;
        int coinscount = 0;
        while (i<coins.length){
             if(amount<0){
                amount+=coins[i];
                noOfCoin[i]+=1;
                coinscount--;
                System.out.print(coins[i]+" Rupees -->"+coinscount);
                System.out.println("\t remaining coins  -->"+noOfCoin[i]);
                i++;
                coinscount= 0;
                continue;
            }
            if(noOfCoin[i]==0){
                System.out.print(coins[i]+" Rupees -->"+coinscount);
                System.out.println("\t remaining coins  -->"+noOfCoin[i]);
                coinscount = 0;
                i++;
                continue;
            }
            if(amount==0){
                System.out.print(coins[i]+"  Rupees -->"+coinscount);
                System.out.println("\tremaining coins "+noOfCoin[i]);
                break;
            }
            amount -= coins[i];
            noOfCoin[i]-=1;
            coinscount++;
        }
        if(amount!=0)
        {
        	System.out.println("Given amount cannot be taken from those coins");
        }
        else
        	System.out.println("Given amount is taken from those coins");
    }
}

