package com.company.leetCode;


/**
 * @Auther: GEEX1428
 * @Date: 2021/8/12 14:20
 * @Description:
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(null == strs){
            return "";
        }
        String param1 = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String temp = "";
            for(int k = 0 ;k<param1.length() && k<strs[i].length();k++){
                if(param1.charAt(k) != strs[i].charAt(k)){
                    break;
                }
                temp = temp+param1.charAt(k);

            }
            param1 = temp;
        }
        return param1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"flower","flow","flight"}));

        char[] chars = new char[5];
        int[] array = new int[]{1,2};

        System.out.println(new Solution().longestCommonPrefix(new String[]{"cir","car"}));
    }

}
