import java.util.*;
public class sortcolors {
    public static void sortcolor(int[] arr){
        int zero=0;
        int one=0;
        int two=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                zero++;
            } else if (arr[i]==1) {
                one++;
            }else{
                two++;
            }
        }
        System.out.println("0="+zero+" " + "1="+one+" " + "2="+two+" ");
        int index=0;
        for(int i=0;i<zero;i++){
            arr[index]=0;
            index++;
        }
        for(int i=0;i<one;i++){
            arr[index]=1;
            index++;
        }
        for(int i=0;i<two;i++){
            arr[index]=2;
            index++;
        }
        System.out.println(index);
    }
    public static void dnfa(int arr[]){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if (arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            } else if (arr[mid]==2) {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};
        dnfa(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(+arr[i]+" ");
        }
        System.out.println();
    }
}
