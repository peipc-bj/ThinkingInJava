package com.ppc.chapter2;

/**
 *
 * @author peipengcheng
 * @create 2018-12-08-下午3:12
 */
public class Section11Exercise1 {

    int fieldInt;
    char fieldChar;
    public static void main(String[] args){
        Section11Exercise1 obj = new Section11Exercise1();
        System.out.println(obj.fieldChar);
        System.out.println(obj.fieldInt);
    }
}/*output   证明jvm默认初始化了成员变量
 
0
*/
