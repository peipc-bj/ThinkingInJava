package com.ppc.chapter4;

/**
 * 吸血鬼数字
 * @author ppc
 * @create 2018-12-17-14:14
 */
public class Exercise10 {
    public static void main(String[] args){
        int[] arr = new int[4];
        for (int i = 1000; i < 10000; i ++){
            if(i % 100 == 0)
                continue;
            findNum(i,arr);
        }
    }

    private static void findNum(int i, int[] arr) {
        int num = i;
        for (int a = 0 ; a < 4;a++){
            arr[a] = i = i % 10;
        }
    }
}
