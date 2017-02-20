public class A004StackUsingLinkedList{
   private LinkList stack ;
   A004StackUsingLinkedList (){
    stack = new LinkList();
   } 

   public void push(int data){
    stack.addToHead(data);
   }

   public int pop(){
    return (int) stack.pop();
   }

   public static void main(String[] args) {
       A004StackUsingLinkedList ob = new A004StackUsingLinkedList();
       ob.push(1);
       ob.push(2);
       //prints 2
       System.out.println(ob.pop());
       ob.push(3);
       ob.push(4);
       ob.push(5);
       //prints 5
       System.out.println(ob.pop());

       
   }
}