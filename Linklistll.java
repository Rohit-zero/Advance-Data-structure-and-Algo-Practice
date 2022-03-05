class Node{
    int a;
    Node next;
    Node(int a){
        this.a=a;
        next=null;
    }
}
public class Linklistll {
    public void lltraiversal(Node head) {
        Node temp=head;
        while(temp !=null)
        {
            System.out.print(temp.a);
            temp=temp.next;
        }
    }
    
    public void add_node_in_starting(int a, Node head) {
        Node node6 =new Node(a);
        node6.next=head;
        head=node6;
        Node temp=head;
        while(temp !=null)
        {
            System.out.print(temp.a);
            temp=temp.next;
        }
        //h 12345
       }

       public void add_node_in_middle_of_two_element(int a, Node head, int i) {
           Node node7=new Node(a);
           Node temp=head;
           for(int t=0;t<i-1;t++)
           {
                temp=temp.next;
           }
            node7.next=temp.next;
            temp=node7;
           //h 6172345
           Node temp2=head;
           while(temp2 !=null)
            {
                System.out.print(temp2.a);
                temp2=temp2.next;
            }
       }
    public static void main(String[] args) {
        Node node1=new Node(1);
        Node head=node1;
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        Linklistll o=new Linklistll();
       // o.lltraiversal(head);
        int a=6;
        //o.add_node_in_starting(a, head);
       // o.lltraiversal(head);
       o.add_node_in_middle_of_two_element(7, head,3);
    }
}
