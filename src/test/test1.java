package test;


import java.io.*;

public class test1 {


    public static void main(String[] args) throws IOException {
        String s1 = "*|*";
        int index = s1.indexOf("|");
        String game = s1.substring(0, index);
        String platforms = s1.substring(index + 1);
        System.out.println(game); // 输出空字符串
        System.out.println(platforms); // 输出 *
    }



}
