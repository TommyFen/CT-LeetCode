/**
* 分割平衡字符串
*/
class Solution {
    public int balancedStringSplit(String s) {
        int num = 0;
        int count = 0;
        for(char ch : s.toCharArray()) {
            if('L' == ch) count++;
            else count--;
            if(count == 0) num++;
        }
        return num;
    }
}
