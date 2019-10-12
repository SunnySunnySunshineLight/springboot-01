package com.sunny;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @Description TODO
 * @Author sunny
 * @Date 2019-9-27 11:03
 * @Version 1.0
 **/
public class FileTest {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Administrator\\Desktop\\111.txt");
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String s = null;
        while ((s = br.readLine())!=null){
            System.out.println(s);
        }
    }
}
