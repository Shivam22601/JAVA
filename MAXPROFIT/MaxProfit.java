public class MaxProfit{
    public int maxProfit(int[] prices){
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int price: prices){
            if(price < minPrice){
                minPrice = price;
            }else if(price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit mp = new MaxProfit();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(mp.maxProfit(prices));
    }
}