public class SumofNatural {
    public static int sumofnatural(int n){
        if (n==0){
            return 0;
        }
        int sum=0;
        sum+=n+sumofnatural(n-1);
        return sum;
    }
}
