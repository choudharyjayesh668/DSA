public class sellstock {
    public static int sellstock(int[] arr){
        int buy=arr[0];
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]<buy){
                buy=arr[i];
            }
            int currentprofit=arr[i]-buy;
            maxprofit=Math.max(maxprofit,currentprofit);
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(sellstock(arr));
    }
}
