import java.util.Arrays;
import java.util.Comparator;
public class Knapsack_problem{
    public void knapsack(double[] weight, double[] value, int capacity) {
        items[] arr=new items[weight.length];
        for(int i=0;i<weight.length-1;i++)
        {
            arr[i]=new items(weight, value, i);
        }

        Arrays.sort(arr, new Comparator<items>() {
            @Override
            public int compare(items o1, items o2)
            {
                return o2.cost.compareTo(o1.cost);
            }
        });
    }
    public static void main(String[] args) {
        Knapsack_problem o =new Knapsack_problem();
        double[] weight = { 10.0, 40.0, 20.0, 30.0 };
        double[] value = { 60.0, 40.0, 100.0, 120.0 };
        int capasity = 50;
    }
}
class items{
    double w;
    double v;
    int index;
    Double cost;

    items(int weight, int value, int index)
    {
        w=weight;
        v=value;
        this.index=index;
        cost = new Double((double)val / (double)wt);
    }
}