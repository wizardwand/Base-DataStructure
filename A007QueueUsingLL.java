public class A007QueueUsingLL{

    private class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data ;
            this.next = null;
        }
    }

    private Node head = null , tail = null ;

    public void enqueue (int data ){
        Node tmp = new Node(data);
        if (isEmpty()) {
            head = tmp;
            tail = head;
        }else{
            tail.next = tmp;
            tail = tmp; 
        }
    }

    public int dequeue(){
        int data = -1; 
        if (!isEmpty()) {
            data = head.data ;
            head = head.next;
            if(head == null ){
                tail = null ;
            }
            return data; 
        }
        System.out.println("queue is Empty!! ");
        return data;
    }

    public boolean isEmpty(){
        if(head == null && tail == null ){
            return true ;
        }
        return false; 
    }

    public void printQueue(){
        Node tmp = head;
        System.out.print("Queue is : ");
        while (tmp != null){
            System.out.print(tmp.data+"-> ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    // Queue is : 10-> 20-> 30->
    // Queue is :
    // queue is Empty!!
    // Queue is : 3-> 6-> 2->
    public static void main(String[] args) {
        A007QueueUsingLL queue = new A007QueueUsingLL();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        //queue.enqueue(363);queue.enqueue(362);queue.enqueue(930);queue.enqueue(130);queue.enqueue(344);queue.enqueue(34);queue.enqueue(340);queue.enqueue(50);queue.enqueue(40);
        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();
        queue.dequeue();
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(2);
        queue.printQueue();
    }
}