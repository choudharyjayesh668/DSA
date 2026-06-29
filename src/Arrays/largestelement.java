public class largestelement{
    public static int largest(int[] arr){
        if(arr==null ||arr.length==0){
            return -1;
        }
        int largest=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int arr[]={2,5,7,0,3,6,8,1};
        System.out.println(largest(arr));
    }
}