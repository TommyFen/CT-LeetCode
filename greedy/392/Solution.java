/**
* 判断子序列
*/
class Solution {
    public boolean isSubsequence(String s, String t) {
        //暂时未进行后续挑战的解答
        int sameLength = 0;
        int k = 0;
        //遍历子序列
        for(int i=0; i < s.length(); i++) {
            //开始遍历父序列，寻找子序列字符
            while(k < t.length()) {
                if(s.charAt(i) == t.charAt(k)){
                    //找到当前子序列字符之后，立刻跳出循环，进行下一个字符寻找
                    sameLength++;
                    k++;
                    break;
                }
                k++;
            }
        }
        return sameLength == s.length();
    }
}
