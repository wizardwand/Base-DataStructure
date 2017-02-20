public class A008InPostPreFIX{
    private int myDelimiter = -362;
    private static final String S = " ";
    public void evaluateInfixToPostFix(String[] arr){
        A004StackUsingLinkedList stack = new A004StackUsingLinkedList();
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            int num = getNo(s);
            if(num == myDelimiter){
                //check for operator 
            }else{
                sb.append(num+S);
            }         
        }
    }

    public void evaluateInfixToPreFix(String[] arr){

    }

    
    public void evalPostFix(String[] arr){//evaluate the expression 
        A004StackUsingLinkedList stack = new A004StackUsingLinkedList();
        String[] input = {"10", "20" , "-"};
        for (String in : input) {
            int num = getNo(in);
            if(num == myDelimiter){
                //is operator 
                int op2 = stack.pop();
                int op1 = stack.pop();
                int result = getResult(op1 , op2 , in);
                stack.push(result);
            }else{
                stack.push(num);
            }
        }
        System.out.println("Result: "+stack.pop());
    }

    public void evalPreFix(String[] arr){

    }

    public int getResult(int op1 , int op2 , String operator){
        switch(operator){
            case "+":
                return op1 + op2;
            case "*":
                return op1 * op2; 
            case "/":
                return op1 / op2;
            case "-":
                return op1 - op2;
        }
        return 0 ; 
    }
    public int getNo(String s ){
        try{
            int no = Integer.parseInt(s);
            return no ;
        }catch(Exception e){
            return -362; 
        }
    }

    public static void main(String []args){
        A008InPostPreFIX ob = new A008InPostPreFIX();
        ob.evalPostFix(args);
    }
}