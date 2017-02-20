public class LinkList{

    private Node head = null, tail = null ;

    private class Node {
        Object data ;
        Node nex; 

        private Node(Object data){
            this.data = data;
            this.nex = null;
        }
    
        Node (Object data, Node nex){
            this(data);
            this.nex = nex;
        }
    }

    /**
    * will return the length of the LinkList 
    */
    public int length(){
        Node ptr = head ; 
        int counter = 0 ; 
        while(ptr != null){
            counter++;
            ptr = ptr.nex; 
        }
        return counter;
    }

    /**
    *Will add the elements in the Link list
    */
    public boolean addToHead(Object data ){

        if(head == null){
            head = new Node(data, null);
            return true;
        }else{
            Node t = new Node(data , head );
            head = t ; 
            return true;
        }
    }

    /**
    *Will add the elements in the Link list
    */
    public boolean push(Object data ){

        if(head == null){
            head = new Node(data, null);
            return true;
        }else{
            Node t = new Node(data , head );
            head = t ; 
            return true;
        }
    }
    /**
    * Prints all the node data in Standard output 
    */
    public void printLinkList(){
        Node ptr = head ; 
        System.out.println("List is :");
        while(ptr != null){
            System.out.print(ptr.data.toString()+"->");
            ptr = ptr.nex;
        }
    }

    public int count(String num){
        int counter = 0 ; 
        Node n = head;
        while(n != null){
            if(num.equals(n.data)){
                counter++;
            }
            n = n.nex;
        }
        return counter;
    }

    /**
    *returns the data at n'th index of the LinkList
    */
    public Object returnDataAtN(int index){
        if(index > -1){
            int i = -1 ;
            Node n = head;
            while(n != null){
                ++i;
                if(i == index){
                    return n.data;
                }
                    n = n.nex;
                
            }
        }else{
            return "Invalid Index";
        }
        return "Sorry! Invalid index. List Got Exhausted. ";
    }

    /**
    *Pop - Pop() takes a non-empty list, deletes
    *the head node, and returns the head node's data. If all you ever used were Push() and
    *Pop(), then our linked list would really look like a stack. However, we provide more
    *general functions like GetNth() which what make our linked list more than just a stack.
    *Pop() should assert() fail if there is not a node to pop.
    */
    public Object pop(){
        Object firstElement = new Object();
        if(head != null){
            firstElement = head.data;
            head = head.nex;

        }else{
            return "List is Empty";
        }
        return firstElement;
    }


    /**
    *insert element at the n'th index in the list 
    */
    public void insertAtN(Object data, int index2){
        if(index2 >-1){
            Node n = head ;
            int counter = 0 ; 
            while(n != null){
                if( counter == index2){
                    Node newTmp = new Node(data , n.nex);
                    n.nex = newTmp;
                    return;
                }
                ++counter;
                n = n.nex;    
            }
        }
        
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
}