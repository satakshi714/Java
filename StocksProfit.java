import java.util.*;


public class StocksProfit {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int max = prices[0];
        int diff = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                while (i < j){
                    if(prices[i] <min){
                        min = prices[i];
                    }
                    if(prices[j] > max){
                        max = prices[j];
                    }
                diff = max - min;
                }
            }
        }
        return diff;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }
        int res = maxProfit(prices);
        System.out.println(res);
    }
    
}