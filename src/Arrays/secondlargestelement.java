public class secondlargestelement {
    public static int secondlargest(int[] arr){
        if(arr==null ||arr.length==2){
            return -1;
        }
        int n=arr.length;
        int largest=arr[0];
        int secondlargest=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if (arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }else if (arr[i]<largest && arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args){
        int[] arr={2,4,6,8,4,6,0,29,26};
        System.out.println(secondlargest(arr));
    }
}
