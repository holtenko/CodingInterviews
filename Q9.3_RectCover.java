public class Solution {
    public int RectCover(int target) {
        if(target==0) return 0;
        int f0=1,f1=1;
        int fn=1;
        for(int i=2;i<=target;i++){
            fn=f0+f1;
            f0=f1;
            f1=fn;
        }
        return fn;
    }
}
