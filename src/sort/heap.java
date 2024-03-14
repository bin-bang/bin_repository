package sort;

public class heap {
    public static void main(String[] args) {
        int[] data={4,31,52,42,1,3,11,45};
        int lastIndex=data.length-1;
        for(int i=0;i<lastIndex;i++){
            builHeap(data,lastIndex-i);
            swap(data,0,lastIndex-i);
        }
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
    }

    private static void builHeap(int[] data,int lastIndex){
        for(int i=(lastIndex-1)/2;i>=0;i--){
            int k=i;
            while (k*2+1<=lastIndex){
                int biggerIndex=2*k+1;
                if (biggerIndex<lastIndex){
                    if (data[biggerIndex]<data[biggerIndex+1]){
                        biggerIndex++;
                    }
                }
                if (data[k]<data[biggerIndex]){
                    swap(data,k,biggerIndex);
                    k=biggerIndex;
                }else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] data,int x,int y){
        int temp=data[x];
        data[x]=data[y];
        data[y]=temp;
    }
}
