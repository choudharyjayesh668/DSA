public class maxsubaaray {
    public static void printsubarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+",");
                }
                System.out.println();
            }
        }
    }
    public static int subarray(int[] arr){
        int maxsum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                int currentsum=0;
                for(int k=i;k<=j;k++){
                    currentsum+=arr[k];
                }
                maxsum=Math.max(currentsum,maxsum);
            }
        }
        return maxsum;
    }
    public static int kadanealgorithem(int[] arr){
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for (int i=0;i<arr.length;i++){
            currentsum+=arr[i];
            maxsum=Math.max(currentsum,maxsum);
            if (currentsum<0){
                currentsum=0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args){
        int[] arr = {-5,-2,-8};
        System.out.println(kadanealgorithem(arr));
    }
}
