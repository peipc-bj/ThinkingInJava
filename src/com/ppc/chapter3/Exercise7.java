package com.ppc.chapter3;

import java.util.Random;

import static com.ppc.util.Print.print;

/**
 * @author peipengcheng
 * @create 2018-12-08-下午7:06
 */
public class Exercise7 {
    public static void main(String[] args){
        Random random = new Random(47);
        int count = 0;
        for (int i = 0; i < 100; i++){
            int result = random.nextInt(100);
            //print(result);
            print(result >= 50);
            count += result>=50 ? 1:0;
        }
        print((double)count/100);
    }
}
