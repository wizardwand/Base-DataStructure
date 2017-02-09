public class A001DynamicArray{
    private int top = -1 ;
    private int size = 16 ;
    private int[] arr ;
    private final int DOUBLE  = 2 ;

    public A001DynamicArray(){
        //init the array to size
        arr = new int[size];
    }
    /**
    * insert at tail in array  Parameter element to insert 
    */
    public void insert(int data){
        insert(top+1, data);
    }
    /**
    * insert at n position in array  Parameter element to insert 
    */
    public void insert(int pos,int data){
        if(pos >= top ){
            if(top<size-1){
                arr[++top] = data;
            }else{
                //create new array and copy earlier elements and remove previous array
                newArrayCopy();
                arr[++top] = data; 
            }
        }else{
            //1 2 3 4 5 -> 2,10 top-4
            if(pos < size-2){
                for(int i = top ; i > pos-1 ; i--){
                    arr[i+1] = arr[i];
                }
                arr[pos] = data;top++;
            }else{
                System.out.println("Wrong position given, Hence will not be inserted!");
            }
        }
        
    }/**
    * delete at first index in array .
    */
    public void delete(){
        delete(0);
    }/**
    * delete at POSITION in array. Parameter position to delete 
    */
    public void delete(int pos){
        if(pos > -1 ){
            //10 20 30 40 50 
            for (int i = pos; i < top; i++) {
                arr[i] = arr[i+1];
            }
            top--;
        }   
    }
    /**
    * read at position in array. Parameter position to read 
    */
    public int read(int pos){
        return arr[pos];
    }/**
    * modify at position in array. Parameter position , value
    */
    public void modify(int pos, int data){
        arr[pos] = data;
    }
    private void newArrayCopy(){
        int arr2[] = new int [size * DOUBLE];size *= DOUBLE;
        for(int i = 0 ; i < arr.length ;i++){
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    public void printArr(){
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void main(String[] args) {
        A001DynamicArray arrDynamic = new A001DynamicArray();
        int size = 10 ;
        for (int i = 0 ; i < size ; i++) {
            arrDynamic.insert((int)(java.lang.Math.random()*size)*10);
        }
        
        arrDynamic.printArr();
        arrDynamic.delete();
        arrDynamic.printArr();

    }
}