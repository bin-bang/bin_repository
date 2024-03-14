package sort;

public class xuer {
    public static void main(String[] args) {
        int[] data={4,31,52,42,1,3,11,45};
        int dk=data.length/2;
        while (dk>=1){
            sort(data,dk);
            dk/=2;
        }
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
    }

    private static void sort(int[] data,int dk){
        for(int i=dk;i<data.length;i++){
            if(data[i]<data[i-dk]){
                int j;
                int x=data[i];
                for(j=i-dk;j>=0 && x<data[j];j=j-dk){
                    data[j+dk]=data[j];
                }
                data[j+dk]=x;
            }
        }
    }
}
