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
    void add_last(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;


        
    }
    void delete_first(){
        head=head.next;

    }
    
}
public class class6 {
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.insertAtBeginning(10);
        list.add_last(20);
        list.add_last(30);
        list.add_last(40);
        list.add_last(50);
       
        list.display();
        list.delete_first();
        list.display();
    }
}
