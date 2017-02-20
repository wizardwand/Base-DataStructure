public class MYReflection {
    public void printName(){
        System.out.println("hello ");
    }

    public static void main(String []a){
        Class c = Class.forName("MYReflection");
        Object obj = c.getInstance();
    }
}