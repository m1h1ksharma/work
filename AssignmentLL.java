public class AssignmentLL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void addNode(int data){
        Node newNode = new Node(data);
      if(head == null){
        head = newNode;
       }else{
       Node current = head;
       while(current.next != null){
        current = current.next;
       }
       current.next = newNode;
     }
    }
     public void Ques1(){
        Node find = head;
        while(find != null){
            if(find.data == 4){
                System.out.println("4 is present in the LinkedList.");
                break;
            }
            else{
                find = find.next;
            }
        }
        System.out.println("4 is not present in the LinkedList.");
     }
    public static void main(String[] args){
        AssignmentLL list = new AssignmentLL();
        list.addNode(5);
        // list.addNode(4);
        list.addNode(40);
        list.addNode(24);
        
        System.out.print("Question 1 : ");
        list.Ques1();
    }
}
