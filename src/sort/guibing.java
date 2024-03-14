package sort;

public class guibing {
    public static void main(String[] args) {
        int[] data={4,31,52,42,1,3,11,45};
        sort(data,0,data.length-1);
        for (int datum : data) {
            System.out.print(datum + " ");
        }
    }

    private static void sort(int[] data,int left,int right){
        if (left>=right){
            return;
        }
        int center=(left+right)/2;
        sort(data,left,center);
        sort(data,center+1,right);
        merge(data,left,center,right);
    }

    private static void merge(int[] data,int left,int center,int right){
        int[] tmpArr=new int[data.length];
        int mid=center+1;
        int third=left;
        int tmp=left;
        while (left<=center && mid<=right){
            if (data[left]<=data[mid]){
                tmpArr[third++]=data[left++];
            }else{
                tmpArr[third++]=data[mid++];
            }
        }
        while (left<=center){
            tmpArr[third++]=data[left++];
        }
        while (mid<=right){
            tmpArr[third++]=data[mid++];
        }
        while (tmp<=right){
            data[tmp]=tmpArr[tmp++];
        }
    }
}
