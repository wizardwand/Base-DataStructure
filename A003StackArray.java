public class A003StackArray{
    int size , top;
    int[] stack ;
    A003StackArray(int size){
        this.size = size;
        top = -1 ;
        stack = new int[size];
    }

    public void push(int data ){
        if(top < size -1 ){
            stack[++top] = data;
        }else{
            System.out.println("Stack overflow!!");
        }
    }

    public int pop(){
        //int data = INTEGER.MIN;
        if(top > -1 ){
            return stack[top--];
        }else{
            System.out.println("stack underFlow");
            return 0;
        }
    }
    public int peak(){
        if(!isEmpty()){
            return stack[top];    
        }
        else{
            System.out.println("stack is Empty ");
            return 0;
        }
    }

    public boolean isEmpty(){
        if(top > -1 ){
            return false;
        }else{
            return true;
        }
    }

    //java A003StackArray 4 1 2 3
    public static void main(String[] args) {
        int size = java.lang.Integer.parseInt(args[0]);
        A003StackArray stack = new A003StackArray(size);
        for (int i = 1 ; i < size; i++ ) {
            stack.push(java.lang.Integer.parseInt(args[i]));
        }
        System.out.println(stack.pop());
    }
}