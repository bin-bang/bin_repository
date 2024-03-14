package sort;

public class charu {
    public static void main(String[] args) {
        int[] data={4,31,52,42,1,3,11,45};
        for(int i=1;i<data.length;i++){
            int insertNum=data[i];
            int index=i-1;
            while (index>=0 && insertNum<=data[index]){
                data[index+1]=data[index];
                index--;
            }
            data[index+1]=insertNum;
        }
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
    }
}
