/**
* Created by holten on 2018-03-14.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public void reOrderArray(int [] array) {
        int[] oddArray = new int[array.length];
        int[] evenArray = new int[array.length];
        int odd = 0;
        int even = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                evenArray[even++] = i;
            } else {
                oddArray[odd++] = i;
            }
        }
        for (int i = 0; i < odd; i++) {
            array[i] = oddArray[i];
        }
        for (int i = 0; i < even; i++) {
            array[odd + i] = evenArray[i];
        }
    }
}