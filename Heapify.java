public class Heapify {
    public void createHeap(int[] arr) {
        for(int i=arr.length/2; i>=0;i--)
        {
            heapify(arr, i);
        }
        for(int i=0; i<arr.length-1;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public void heapify(int[] arr, int i) {
        int largest=i;
        int l=2*i;
        int r=2*i+1;

        if(l<=arr.length-1 && arr[l]>arr[largest])
        {
            largest=l;
        }
        if(r<=arr.length-1 && arr[r]>arr[largest])
        {
            largest=r;
        }
        if(largest !=i)
        {
            swap(arr,i, largest);
            heapify(arr,largest);
        }
    }

    public int[] swap(int[] arr,int i, int largest) {
        int temp=arr[i];
        arr[i]=arr[largest];
        arr[largest]=temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={10,30,50,20,35,15};
        Heapify o = new Heapify();
        o.createHeap(arr);
        //o.heapify(arr);
    }
}
