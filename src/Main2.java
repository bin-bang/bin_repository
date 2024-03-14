import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] l1=sc.nextLine().split(" ");
        int index=Integer.parseInt(l1[1]);
        String[] l2=sc.nextLine().split(" ");
        int[] arr=new int[l2.length];
        for(int i=0;i<l2.length;i++){
            arr[i]=Integer.parseInt(l2[i]);
        }
        Arrays.sort(arr);
        int res=cal(arr,arr.length-index,index);
        System.out.println(res);
    }

    public static int cal(int[] data,int index,int res){
        for(int i=index;i<data.length;i++){
            if(data[i]==0){
                res--;
            }else{
                break;
            }
        }
        for(int i=index-1;i>=0;i++){
            if(index<data.length && data[i]>=data[index]){
                res++;
            }else{
                break;
            }
        }
        return res;
    }
}
