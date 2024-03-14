package wangyi.xiaozhao2021;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        sc.close();
        int l1=0,l2=0,l3=0;
        int temp=0;

        for(int i=0;i<s.length;i++){
            if (s[i]=="0"){
                l1++;
            }else{
                break;
            }
        }

        for(int i=s.length-1;i>=0;i--){
            if(s[i]=="0"){
                l3++;
            }else{
                break;
            }
        }

        for(int i=0;i<s.length;i++){
            if(s[i].equals("0")){
                temp++;
            }else{
                l2=Math.max(l2,temp);
                temp=0;
            }
        }
        int ll2;
        if(l2%2==0){
            ll2=l2/2;
        }else{
            ll2=l2/2+1;
        }
        System.out.println(Math.max(l1,Math.max(ll2,l3)));
    }
}
