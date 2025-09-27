class Node
{
    int data;
    Node next;
    public Node (int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LinkedList
{
    Node head;
    public void insert(int data)
    {
        Node n1 = new Node(data);
        if (head==null)
        {
            head=n1;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next=n1;
    }
    public void show()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
class Sample
{
    public static void main(String s[])
    {
        LinkedList l1 = new LinkedList();
        l1.insert(10);
        l1.insert(43);
        l1.insert(9876);
        l1.insert(864);
        System.out.println("Linked list is: ");
        l1.show();
    }
}