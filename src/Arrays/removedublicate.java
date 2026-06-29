public class removedublicate {
    public static int removedublicate(int[] arr){
        if (arr==null || arr.length==0){
            return -1;
        }
        int i=0;
        int j=i+1;
        while(j<arr.length){
            if (arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
            j++;
        }
        return i+1;
    }
    public static void main(String[] args){
        int[] arr={2,4,6,8,4,6,0,29,26,4,2,4,2};
        System.out.println(removedublicate(arr));
    }
}
