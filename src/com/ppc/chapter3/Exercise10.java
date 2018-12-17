package com.ppc.chapter3;

/**
 * @author ppc
 * @create 2018-12-17-11:41
 */
public class Exercise10 {
    public static void main(String[] args){
        //int i = 6;
        System.out.println(Integer.toBinaryString(6));
        System.out.println(Integer.toBinaryString(6 ^ 6));
        System.out.println(Integer.toBinaryString(6 ^ 6 ^ 6));
        System.out.println(Integer.toBinaryString(6 ^ 3));
    }
}
/*
110
0
110
101
 */
