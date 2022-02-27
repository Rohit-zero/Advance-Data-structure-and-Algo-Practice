public class Insertion_sort {
    int[] arr={3,2,6,5,8,9,0,1,4};
    public void Isorting() {
        for(int i=1;i<arr.length-1;i++)
        {
            int temp= arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp) {
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
        for(int p=0;p<arr.length-1;p++)
        {
            System.out.print(arr[p]);
        }
    }
    public static void main(String[] args) {    
        Insertion_sort o=new Insertion_sort();
        o.Isorting();
    }
}
