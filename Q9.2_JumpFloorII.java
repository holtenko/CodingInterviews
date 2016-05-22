public class Solution {
    public int JumpFloorII(int target) {
        if(target==0||target==1) return 1;
        int f1=1;
        int fn=1;
        for(int i=2;i<=target;i++){
            fn=2*f1;
            f1=fn;
        }
        return fn;
    }
}
