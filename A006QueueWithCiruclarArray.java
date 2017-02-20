public class A006QueueWithCiruclarArray{
    private int size = 3;
    private int[] queue = new int [size];
    private int head = -1 , tail = -1 ;

    public boolean isEmpty(){
        if(head == -1 && tail == -1){
            return true;
        }
        return false;
    }
    public int dequeue(){
        int data = 0;
        if (!isEmpty()) {
            data = queue[head];
            int tmpHead =  (head +1)% size ;
            if(head == tail){
                head = -1 ;
                tail = -1 ;
            }
            else{
                head = tmpHead;
            }
            return data;
        }
        System.out.println("Queue is Empty!!");
        return 0;
    }
    public void enqueue(int data ){
        if(isEmpty()){
            head = 0 ; tail = 0 ;
            queue[tail] = data;
        }else{
            int nextTail = (tail+1)%size; 
            if(nextTail != head){
                tail = nextTail ;
                queue[tail] = data; 
            }else{
                System.out.println("Queue is full!!");
            }
        }
    }
    public void printQueue(){
        System.out.println("QUEUE:"+java.util.Arrays.toString(queue));
    }
    public static void main(String[] args) {
        A006QueueWithCiruclarArray queue = new A006QueueWithCiruclarArray();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
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