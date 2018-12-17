package com.ppc.chapter3;

/**
 * @author ppc
 * @create 2018-12-17-13:35
 */
public class Exercise13 {
    public static void main(String[] args){
        char2Binary('a');
    }

    public static void char2Binary(char c){
        System.out.println(Integer.toBinaryString(c));
    }
}
