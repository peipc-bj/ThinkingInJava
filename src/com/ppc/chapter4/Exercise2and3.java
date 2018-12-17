package com.ppc.chapter4;

import java.util.Random;

/**
 * @author Administrator
 * @create 2018-12-17-13:51
 */
public class Exercise2and3 {
    public static void main(String[] args){
        //compare2();
        compare3();
    }
    public static void compare2(){
        Random random = new Random(47);
        int pre = 0;
        for (int i = 0; i< 25; i++){
            int now = random.nextInt(1000);
            //System.out.println(pre);
            //System.out.println(now);
            System.out.println(pre < now?"pre < now":pre == now?"pre == now":pre > now?"pre > now":"");
            pre = now;
        }
    }

    public static void compare3(){
        Random random = new Random(47);
        int count = 0;
        int pre = 0;
        int now = random.nextInt(1000);
        while (pre != now){
            pre = now;
            now = random.nextInt(1000);
            //System.out.println(pre);
            //System.out.println(now);
            System.out.println(pre < now?"pre < now":pre == now?"pre == now":pre > now?"pre > now":"");
            count++;
        }
        System.out.println(count);
    }
}
