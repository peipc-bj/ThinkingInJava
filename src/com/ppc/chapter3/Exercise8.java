package com.ppc.chapter3;

import static com.ppc.util.Print.print;

/**
 * @author peipengcheng
 * @create 2018-12-08-下午7:12
 */
public class Exercise8 {
    public static void main(String[] args){
        long a = 0x5F;
        long b = 067;
        print(a);
        print(b);
        print(Long.toBinaryString(a));
        print(Long.toBinaryString(b));
    }
}
