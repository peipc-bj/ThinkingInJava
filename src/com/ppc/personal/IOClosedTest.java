package com.ppc.personal;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author ppc
 * @create 2018-12-17-14:43
 */
public class IOClosedTest {
    public static void main(String[] args) throws Exception{
        System.out.println(System.getProperties());
       testIO("F:\\eclipse\\mat\\notice.html");
    }

    private static void testIO(String filePath) throws Exception{
        FileInputStream inputStream = new FileInputStream(filePath);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
        inputStream.close();
        inputStreamReader.close();
        reader.close();
    }
}
