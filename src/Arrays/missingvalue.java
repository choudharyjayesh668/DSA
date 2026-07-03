public class missingvalue {
    public static int missingvalue(int[] arr){
        int xor=0;
        for (int i=0;i<arr.length;i++){
            xor=xor^arr[i];
            xor=xor^i;
        }
        xor = xor ^ arr.length;
        return xor;
    }
    public static void main(String[] args){
        int[] arr = {3,0,1};
        System.out.println(missingvalue(arr));
    }
}
