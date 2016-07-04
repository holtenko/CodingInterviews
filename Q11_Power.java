/**
* Created by holten on 2016-07-04.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public double Power(double base, int exponent) {
        if(base==0&&exponent<=0) return 1;
        double result;
        if(exponent<0)
            result=1/PowerUnsigned(base, -exponent);
        else
            result=PowerUnsigned(base, exponent);
        return result;
  	}
    
    public double PowerUnsigned(double base, int exponent) {
        if(exponent==0) return 1;
        if(exponent==1) return base;
        double result=PowerUnsigned(base,exponent/2);
        result*=result;
        if(exponent%2==1) result*=base;
        return result;
  	}
}