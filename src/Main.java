import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            String[] ss=sc.nextLine().split(" ");
            int[] arr=new int[ss.length];
            for(int i=0;i<ss.length;i++){
                arr[i]=Integer.parseInt(ss[i]);
            }
            String[] ds=sc.nextLine().split(" ");
            int[] di=new int[ds.length];
            for(int i=0;i<ds.length;i++){
                di[i]=Integer.parseInt(ds[i]);
            }
            if(arr[2]>arr[3]){
                int temp=arr[2];
                arr[2]=arr[3];
                arr[3]=temp;
            }
            Arrays.sort(di);
            if(arr[2]>di[0] || arr[3]<di[di.length-1]){
                System.out.println("NO");
                continue;
            }
            if (arr[0]-arr[1]>=2){
                System.out.println("YES");
                continue;
            }
            List<int[]> list=Arrays.asList(di);
           if(arr[0]-arr[0]==1){
               if(list.indexOf(arr[3])>=0 || list.indexOf(arr[2])>=0){
                   System.out.println("YES");
                   continue;
               }
           }
            if(arr[0]-arr[0]==0){
                if(list.indexOf(arr[3])>=0 && list.indexOf(arr[2])>=0){
                    System.out.println("YES");
                    continue;
                }
            }
            System.out.println("NO");
        }
    }
}
