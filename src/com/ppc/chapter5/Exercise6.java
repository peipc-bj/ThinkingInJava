package com.ppc.chapter5;

/**
 * 重载方法，完整匹配类型，但是这很容易迷惑，尽量不要这样做
 * @author ppc
 * @create 2018-12-17-14:36
 */
public class Exercise6 {

    public static void main(String[] args){
        Dog5 dog5 = new Dog5();
        dog5.bark(1);
        dog5.bark(1L);
        Dog6 dog6 = new Dog6();
        dog6.bark(1,1L);
        dog6.bark(1L,1);
    }
}
class Dog5{
    public void bark(int a){
        System.out.println("barking5");
    }
    public void bark(long a){
        System.out.println("howling5");
    }
}
class Dog6{
    public void bark(int a,long b){
        System.out.println("barking6");
    }
    public void bark(long a,int b){
        System.out.println("howling6");
    }
}
