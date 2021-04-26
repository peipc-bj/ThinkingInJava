package com.ppc.personal;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author Administrator
 * @create 2021-04-02 11:56
 */
public class Test1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\用户目录\\我的文档\\NetSarang " +
                "Computer\\6\\Xshell\\Sessions\\application" +
                ".mis-service-authorize-68c5949b59-5cd8l.20210402.log")));
        //while(true) {
        //    String readLine = br.readLine();
        //    if (readLine != null && readLine != "") {
        //        if (readLine.contains("需要补数据的机构")) {
        //            String a = readLine.substring(readLine.lastIndexOf("机构") + 4,
        //                    readLine.lastIndexOf("$$") - 1);
        //            String[] split = a.split(",");
        //            for (String kv : split) {
        //                String[] split1 = kv.trim().split("=");
        //                String key = split1[0];
        //                String value = split1[1];
        //                System.out.println(key);
        //                System.out.println(value);
        //            }
        //        }
        //    } else {
        //        break;
        //    }
        //}

        while(true) {
            String readLine = br.readLine();
            if (readLine != null && readLine != "") {
                if (readLine.contains("订单详情：")) {
                    String orgID = readLine.substring(readLine.lastIndexOf("代理商机构ID：") + 8,
                            readLine.lastIndexOf("代理商机构名称：") - 2);
                    String orgName = readLine.substring(readLine.lastIndexOf("代理商机构名称：") + 8,
                            readLine.lastIndexOf("基础pos数量：") - 2);
                    System.out.println(orgID);
                    System.out.println(orgName);
                    String a = readLine.substring(readLine.lastIndexOf("订单详情：") + 5,
                            readLine.lastIndexOf("$$") - 1);
                    //System.out.println(a);
                    String[] split = a.split(",");
                    for (String kv : split) {
                        String[] split1 = kv.trim().split("=");
                        String key = split1[0];
                        if (key.contains("ProductItems(")) {
                            key = key.substring(key.lastIndexOf("ProductItems(") + 13);
                        }
                        String value = split1[1];
                        if ("null".equals(value) || "null)".equals(value)) {
                            continue;
                        }
                        //System.out.println(key);
                        //System.out.println(value);
                    }
                }
            } else {
                break;
            }
        }

    }
}
