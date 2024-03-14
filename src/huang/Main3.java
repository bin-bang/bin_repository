package huang;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {

        List<Integer> list1 =new ArrayList<>();
        List<Integer> list2 =new ArrayList<>();
        Collections.sort(list1);
        Collections.sort(list2);
        Set<Integer> res=new LinkedHashSet<>();
        if (list1.size()>list2.size()){
            List<Integer> tmp=list1;
            list1=list2;
            list2=tmp;
        }
        int index=0;
        for (int i=0;i<list1.size();i++){
            if (index>=list2.size()){
                break;
            }
            int a=list1.get(i);
            int b=list2.get(index);
            while(a>b){
                index++;
                b=list2.get(index);
            }
            if (a==b){
                res.add(a);
            }
        }
        int cnt=0;
        for (int x: res) {
            if (cnt>=5){
                break;
            }
            System.out.println(x);
            cnt++;
        }
    }
}
