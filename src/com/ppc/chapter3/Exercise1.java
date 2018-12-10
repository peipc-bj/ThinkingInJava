package com.ppc.chapter3;

import com.ppc.util.Print;

import java.util.Date;

import static com.ppc.util.Print.*;

/**
 * @author peipengcheng
 * @create 2018-12-08-下午5:54
 */
public class Exercise1 {

    float fieldFloat;

    public static void main(String[] args){
        print("Hello, it's");
        print(new Date().toLocaleString());
        Exercise1 obj1 = new Exercise1();
        Exercise1 obj2 = new Exercise1();
        obj1.fieldFloat = 17.1f;
        obj2.fieldFloat = 11.7f;

    }
}
