/**
* Link list test class 
*/
//java A002SLinkList "shirish" "was " "found" "in" "find" "valley"
//java A002SLinkList '1' '2' '3'
public class A002SLinkList{
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List World!!");
        LinkList ll = new LinkList();
        for (String s : args) {
            ll.addToHead(s);
        }
        //print length 
        System.out.println("length of LinkList: "+ll.length());
        //print link list
        ll.printLinkList();
        System.out.println();
        // find the word ""find"" in the given list 
        String find = "find";
        System.out.println(find+" found "+ll.count(find)+" many time!");
        //return the element data  at the index given
        int index = 2 ;
        System.out.println("Element At "+index+ " is: "+ll.returnDataAtN(index));
        //pop the element at head of the link list
        System.out.println("Element At Head : "+ll.pop()+" POPPED !");
        //insert data at given index in the link list
        int indexInsert = 0 ; 
        ll.insertAtN("Welcome to LINK LIST GAME ZONE!!" , indexInsert);
        //print link list 
        ll.printLinkList();

    }
}