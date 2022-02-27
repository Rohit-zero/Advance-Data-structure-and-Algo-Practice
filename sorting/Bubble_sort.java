public class Bubble_sort {
    int arr[]={3,2,6,5,8,9,0,1,4};
    public void bsorting() {
        
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            count += 1;
        }
        for(int p=0;p<arr.length-1;p++)
        {
            System.out.print(arr[p]);
        }
    }
   
    public static void main(String[] args) {
        
        Bubble_sort o=new Bubble_sort();
        o.bsorting();
    }
}
