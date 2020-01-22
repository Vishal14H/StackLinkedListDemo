import java.util.*;
class Node{
    int data;
    Node next;

        }
public class StackLinkedListDemo {
    Node top;
    StackLinkedListDemo(){
        top=null;

    }
    void push(){
        System.out.println("Enter elements:");
        Scanner sc=new Scanner(System.in);
        int newitem= sc.nextInt();
        Node newnode=new Node();
        newnode.data=newitem;
        newnode.next=top;
        top=newnode;
        System.out.println("Element inserted.");

    }
    void peek(){
        if(top==null){System.out.println("Stack is empty.");

        }
        else{
            System.out.println("Element deleted: "+top.data);

        }

    }

    void traverse(){
        if(top==null){
            System.out.println("Stack is empty.");

        }
        else{
            System.out.println("Elements in stack are:");
            Node current;
            for(current=top;current !=null; current=current.next){
                System.out.println(current.data);
            }

        }

    }
    void pop(){
        System.out.println("Element deleted: "+ top.data);
        top=top.next;

    }

    public static void main(String[] args) {
        StackLinkedListDemo obj= new StackLinkedListDemo();

        while(true){

            System.out.println("Press 1 to push.");
            System.out.println("Press 2 to peek.");
            System.out.println("Press 3 to traverse.");
            System.out.println("Press 4 to pop.");
            System.out.println("Press 5 to exit.");
            System.out.println("Enter your choice:");
            Scanner choice = new Scanner(System.in);
            int ch = choice.nextInt();
            switch(ch){
                case 1:
                    obj.push();
                    break;

                case 2:
                    obj.peek();
                    break;

                case 3:
                    obj.traverse();
                    break;

                case 4:
                    obj.pop();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Input Valid choice.");




            }
        }
    }
}
