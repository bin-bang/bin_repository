package sort;

public class maopao {
    public static void main(String[] args) {
        int[] data={4,31,52,42,1,3,11,45};
        for(int i=0;i<data.length;i++){
            for(int j=1;j<data.length-i;j++){
                if(data[j-1]>data[j]){
                    int temp=data[j-1];
                    data[j-1]=data[j];
                    data[j]=temp;
                }
            }
        }
        for (int datum : data) {
            System.out.print(datum + " ");
        }
    }
}
