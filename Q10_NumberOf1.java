/**
* Created by holten on 2016-07-04.
* Email: holten.ko@gmail.com
*/

public class Solution {
public int  NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
     }
}