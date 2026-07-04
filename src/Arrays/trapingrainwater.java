public class trapingrainwater {
    public static int trapingrainwater(int[] arr){
        int trapwater=0;
        int[] leftmax=new int[arr.length];
        leftmax[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }
        int[] rightmax=new int[arr.length];
        rightmax[arr.length - 1] = arr[arr.length - 1];
        for(int i=arr.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
        for (int i=0;i<arr.length;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trapwater+=waterlevel-arr[i];
        }
        return trapwater;
    }
    public static void main(String[] args){
        int[] arr = {4,2,0,3,2,5};
        System.out.println(trapingrainwater(arr));
    }
}
