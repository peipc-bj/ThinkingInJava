package com.ppc.personal;

/**
 * @author peipengcheng
 * @create 2018-12-09-下午5:45
 */
public class FangDai {
    private static final double total = 715333.28d;

    private static final double bilv = 0.05635d;

    private static final double month = 2055.56d;

    public static void main(String[] args){
        System.out.println(total - month*5);
        double totalNow = total;
        for(int i = 0 ; i < 5; i ++){
            totalNow = totalNow - month;
        }
        System.out.println(totalNow);
        double totalNow3  = totalNow -= 200000;
        double totalNow2 = totalNow3;
        double totalBuy = 0d;
        double totalBuy2 = 0;
        double totalBuy3 = 0;
        int count = 1;
        while ((totalNow - (totalNow * bilv/12)) > 0){
            totalNow = totalNow - month;
            count ++;
        }
        System.out.println(count);
        for (int i = 0 ;i < 343;i++){
            //System.out.println((totalNow * bilv/12) +month);
            totalBuy += (totalNow3 * bilv/12) +month;
            totalNow3 = totalNow3 - month;

        }
        for (int i = 0 ;i < 247;i++){
            System.out.println((totalNow2 * bilv/12) +month);
            totalBuy2 += (totalNow2 * bilv/12) +month;
            totalNow2 = totalNow2 - month;

        }
        System.out.println(totalBuy);
        System.out.println(totalBuy2);
    }
}
