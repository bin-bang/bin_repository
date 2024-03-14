package sort;

public class kuaipai {
    public static void main(String[] args) {
        int[] data={4,31,52,42,1,3,11,45};
        sort(data,0,data.length-1);
    }

    private static void sort(int[] data, int low, int hight){
        int start =low;
        int end=hight;
        int key=data[low];

        while(end>start){
            while (end>start && data[end]>=key) {
                end--;
            }

            if (data[end]<=key){
                int temp=data[start];
                data[start]=data[end];
                data[end]=temp;
            }

            while (end>start && data[start]<=key) {
                start++;
            }

            if(data[start]>=key){
                int temp=data[start];
                data[start]=data[end];
                data[end]=temp;
            }
        }
        for (int datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();
        if (start>low) sort(data,low,start-1);
        if (end<hight) sort(data,end+1,hight);
    }
}
