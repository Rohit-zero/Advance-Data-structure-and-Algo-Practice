public class cycle_sort {
    public void sort(int[] arr) {
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]==i+1)
            {
                i++;
            }else{
                swap(arr, i, arr[i]-1);
            }
        }
        for(int n=0; n<arr.length;n++)
        {
            System.out.print(arr[n] + ",");
        }
    }
    public void swap(int[] arr,int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr={5,3,1,2,4};
        cycle_sort o=new cycle_sort();
        o.sort(arr);
    }
}
