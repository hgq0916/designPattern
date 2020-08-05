package com.mashibing.designpattern.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.adapter.AdapterTest
 * @Description: TODO
 * @date 2020/8/5 10:18
 */
public class AdapterTest {

  public static void main(String[] args) throws Exception {
    InputStream inputStream = new FileInputStream("F:\\study\\project\\designPattern\\src\\main\\java\\com\\mashibing\\designpattern\\asm\\ClassPrinter.java");
    InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"utf8");
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    String str = null;
    while ((str=bufferedReader.readLine())!= null){
      System.out.println(str);
    }
  }

}
