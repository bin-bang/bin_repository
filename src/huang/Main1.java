package huang;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            long x=Long.parseLong(sc.nextLine());
            long v=0;
            int res=0;
            int l=1, r= (int) 1e8;
            while (l<=r){
                int mid=(l+r)/2;
                if (judge(mid)>=x){
                    r=mid-1;
                    v=judge(mid);
                    res=mid;
                }else {
                    l=mid+1;
                }
            }
            if (x==v-1){
                res++;
                System.out.println(res);
                continue;
            }else {
                System.out.println(res);
                continue;
            }
        }
    }

    private static long judge(int n){
        return ((long)n*(long)(n+1))/2;
    }
}

