public class Fibonacchi {
    public static int fibonaccie(int n){
        if (n==0||n==1){
            return n;
        }
        int f1=fibonaccie(n-1);
        int f2=fibonaccie(n-2);
        int fibo=f2+f1;
        return fibo;
    }
}
