package com.company.collect;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static StringBuffer stringBuffer = new StringBuffer();


    static String twoBinary(int math){
        int mm = math;
        if(math == 1){
            stringBuffer.append(1);
            return stringBuffer.toString();
        }
        if(math % 2 == 0){
            mm =mm/2;
            stringBuffer.append(0);
            twoBinary(mm);
        }else {
            mm =mm/2;
            stringBuffer.append(1);
            twoBinary(mm);
        }

        String aa = stringBuffer.toString();
        char[] chars = aa.toCharArray();

        StringBuffer str1 = new StringBuffer();
        for(int i = chars.length-1;i>=0;--i){
            str1.append(chars[i]);
        }
        return str1.toString();
    }

    public static void main(String[] args) {
        //Map<String,Object> map = new HashMap<>();
        String aa = twoBinary(1569);
        System.out.println();

        // 11000100001
    }
}
