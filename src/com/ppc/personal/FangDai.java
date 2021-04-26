package com.ppc.personal;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author peipengcheng
 * @create 2018-12-09-下午5:45
 */
public class FangDai {
    //2019-07-15余额
    private static final double total = 300944.36d;

    private static final Double bilv = 0.05635d;

    private static final double month = 2055.56d;//本金

    public static void main(String[] args) throws Exception{
        double totalNowAfter2 = total - month * 1;//2个月后余额
        System.out.println(totalNowAfter2);
        double totalNow = totalNowAfter2;//2个月后提前还款后余额
        System.out.println(totalNow);
        double totalNow2 = totalNow;
        double totalBuy = 0;
        int count = 0;
        while(true){
            double lixi = totalNow2 * bilv / 12;
            System.out.println("lixi========"+(lixi + month));
            totalBuy += lixi + month;
            //每月还款，利息计算值
            totalNow2 = totalNow2 - month;
            System.out.println(totalNow2);
                count ++;
            if(totalNow2 < 0 ){
                break;
            }
        }
        System.out.println(totalBuy);
        System.out.println(count);
        System.out.print(getMonth(count));
    }

    static String getMonth(int count) throws Exception{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(simpleDateFormat.parse("2019-07-10"));
        calendar.add(Calendar.MONTH,count);
        return simpleDateFormat.format(calendar.getTime());
    }
}
