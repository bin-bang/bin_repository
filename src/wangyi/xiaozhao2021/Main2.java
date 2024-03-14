package wangyi.xiaozhao2021;

import java.util.Scanner;

public class Main2 {
    private static int res=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        cal(s,0);
        System.out.println(res);
    }

    public  static void cal(String s,int index){
        if (index==s.length()-1){
            res++;
            return;
        }
        if(index>=s.length()){
            return;
        }
        if(s.charAt(index)=='0'){
            cal(s,index+1);
        }
        if(s.charAt(index)=='1'){
            cal(s,index+1);
            cal(s,index+2);
            cal(s,index+3);
        }

    }
}
