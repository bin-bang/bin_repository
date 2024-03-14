import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class kai {
    public static void main(String[] args) throws InterruptedException {
       /*int[][] data={{1,1},{2,2},{2,3},{0,2},{1,4},{0,1},{1,5},{0,1}};
        ArrayList<Integer> res;
        res=process(data);
        for(int i:res){
            System.out.println(i);
        }
        for (;;){
            Thread.sleep(100000);
        }*/



       String s="111111111111";
       String[] temp =s.split("==");
        System.out.println(temp[0]);
    }

    private  static  ArrayList<Integer> process(int[][] queries){
        Deque deque=new LinkedList();
        ArrayList<Integer> res=new ArrayList<>();
        for (int i=0;i<queries.length;i++){
            switch (queries[i][0]){
                case 1:deque.addFirst(queries[i][1]);
                break;
                case 2:deque.addLast(queries[i][1]);
                break;
                case 0:res.add(cal(deque,queries[i][1]));
                break;
            }
        }
        return res;
    }

    private static int cal(Deque<Integer> deque,int num){
        int index=0;
        for(int i:deque){
            if (i!=num){
                index++;
            }else {
                break;
            }
        }
        return Math.min(index-0,deque.size()-1-index);
    }
}
