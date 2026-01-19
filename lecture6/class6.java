// linked list creation


class node{// node creation using  class
    int data;
    node next;
    node(int  data){
        this.data=data;
        this.next=null;
    }
}
class linkedlist{
    node head;
    void insertAtBeginning(int data){
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
    }
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
public class class6 {
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        list.insertAtBeginning(50);
        list.display();
    }
}
