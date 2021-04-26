package com.ppc.personal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author peipengcheng
 * @create 2018-12-09-下午5:45
 */
public class FangDai2 {
    //2019-07-15余额
    private static final double total = 259820.16d;

    private static final Double bilv = 0.05485d;

    private static final double month = 2062.06d;//本金

    private static final double money = 20 *10000d;//本金

    private static final String date = "2021-06-15";

    public static void main(String[] args) throws Exception{
        double totalNow = total;
        if (money > 0 && date != null) {

        }

        double totalBuy = 0;
        int count = 0;
        while(true){
            double lixi = totalNow * bilv / 12;
            System.out.println("利息========"+(lixi + month));
            totalBuy += lixi + month;
            //每月还款，利息计算值
            totalNow = totalNow - month;
            System.out.println(totalNow);
                count ++;
            if(totalNow < 0 ){
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
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH,count);
        return simpleDateFormat.format(calendar.getTime());
    }
}
