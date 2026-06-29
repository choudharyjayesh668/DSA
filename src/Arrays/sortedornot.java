public class sortedornot {
    public static boolean sortedrnot(int[] arr){
        if (arr==null || arr.length==0){
            return false;
        }
        int n=arr.length;
        int i=0;
        int j=i+1;
        while(i<n-1){
            if (arr[i]>arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr={2,4,6,8,4,6,0,29,26};
        System.out.println(sortedrnot(arr));
    }
}
