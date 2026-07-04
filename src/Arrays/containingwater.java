public class containingwater {
    public static int maxarea(int[] arr){
        int maxarea=0;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                int width=j-i;
                int height=Math.min(arr[i],arr[j]);
                int currentarea=width*height;
                maxarea=Math.max(currentarea,maxarea);
            }
        }
        return maxarea;
    }
    public static int maxareaoptimized(int[] arr){
        int l=0;
        int r=arr.length-1;
        int maxarea=0;
        while(l<r){
            int width=r-l;
            int height=Math.min(arr[l],arr[r]);
            int currentarea=width*height;
            maxarea=Math.max(currentarea,maxarea);
            if (arr[l]<arr[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxarea;
    }
    public static void main(String[] args){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxareaoptimized(arr));
    }
}
