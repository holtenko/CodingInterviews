public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0||array==null) return 0;
        if(array.length==1) return array[0];
        int min=array[0];
        for(int i=0;i<array.length-1;i++){
            if(array[i+1]<array[i]){
                min=array[i+1];
                break;
            }
        }
        return min;
    }
}
