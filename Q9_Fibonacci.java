public class Solution {
    public int Fibonacci(int n) {
        int f0=0;
        int f1=1;
        int fn=0;
        if(n<=0) return f0;
        if(n==1) return f1;
        for(int i=2;i<=n;i++){
            fn=f0+f1;
            f0=f1;
            f1=fn;
        }
        return fn;
    }
}
