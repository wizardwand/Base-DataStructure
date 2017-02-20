public class Tester {
    public static void main(String[] args) {
        String s = "12 + 1" ; 
        char ch[] = s.toCharArray();
        String sa[] = s.split(" ");
        for (char c : ch) {
           // System.out.println(c);
        }

        for (String ss : sa) {
            System.out.println(ss);
            try{
                int no = Integer.parseInt(ss);
                System.out.println(no);
            }catch(Exception e){

            }
        }
    }
}