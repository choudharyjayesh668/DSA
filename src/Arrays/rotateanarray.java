public class rotateanarray {
    public static void rotatearray(int[] arr,int k){
        int[] ans= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int newindex=(i+k)%arr.length;
            ans[newindex]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
    }
    public static void rotatearrayoptmized(int[] arr,int k){  //optimized to O(1) space
        k=k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
    public static void reverse(int[] arr, int start ,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
