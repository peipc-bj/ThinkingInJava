package com.ppc.personal;

import java.util.Arrays;

/**
 * @author Administrator
 * @create 2019-08-01 16:44
 */
public class TestArray {

    public static void compare(Object[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        //Object[] objs = new String[12];
        //compare(new String[]{"x","y","z"});
        //compare(new Integer[]{1,2,3});
        ////协变数组类型
        //objs[10] = 12;//Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer

        System.out.println(getImageNew("group2/M02/E3/A5/wKgVT1y29FKQM5seAB60XnWmbNU367=c3290x3290+244+0!.jpg"));
    }

    private static String getImageNew(String image){
        String imageNew = image;
        if (image.contains("=")){
            String aa =image.substring(image.charAt('='),image.charAt('.'));
            System.out.println(aa);
            System.out.println(image.charAt('='));
            System.out.println(image.indexOf("="));
            System.out.println(image.indexOf("."));
            System.out.println(image.charAt('.'));
            imageNew = image.replace(image.substring(image.indexOf("="),image.indexOf(".")), "");
        }
        return imageNew;
    }
}
