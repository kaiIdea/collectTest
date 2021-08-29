package com.company.collect;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final StringBuffer stringBuffer = new StringBuffer();


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
        if(chars.length < 16){
            int len = 16-chars.length;
            for(int i = 0;i<len;i++){
                str1.append(0);
            }
        }

        for(int i = chars.length-1;i>=0;--i){
            str1.append(chars[i]);
        }
        return str1.toString();
    }

    public static void main(String[] args) {
        //Map<String,Object> map = new HashMap<>();
        //String aa = twoBinary(1569);

        int hash = 1569,n=16;
        int i = (n-1) & hash;

        String a1 = twoBinary(15);

        String a2 = twoBinary(1569);


        String b1 = Integer.toBinaryString(15);
        String b2 = Integer.toBinaryString(1632);
        // 11000100001
    }
}