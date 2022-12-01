package BackTracking;

public class Coin_Permutation {
    public static void main(String[] args) {
        int[] coin = {2,3,5,7};
        int amt = 10;
        PrintAnswer(coin,amt,"");

    }
    static void PrintAnswer(int[] coin,int amt,String res)
    {
        if(amt == 0)
        {
            System.out.println(res);
            return;
        }
        for(int i=0;i<coin.length;i++)
        {
            if(amt >= coin[i])
            {
                PrintAnswer(coin,amt-coin[i],res+coin[i]);
            }
        }
    }
}
