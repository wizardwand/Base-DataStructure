public class A005BalancedParanthesisUsingStack {
    private LinkList stack = new LinkList();
    
    //java A005BalancedParanthesisUsingStack "[(a) + b ]"   prints true 
    //java A005BalancedParanthesisUsingStack "[(a) + b }]"  prints false
    public static void main(String[] args) {
        
        String expression = args[0];
        A005BalancedParanthesisUsingStack ob = new A005BalancedParanthesisUsingStack();
        System.out.println("expression: "+expression+" is Balanced? "+ob.isBalanced(expression));
    }

    public boolean isBalanced(String expression){
        for (char ch : expression.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else if(ch == ')'){
                char poped = (char) stack.pop();
                if(poped != '('){
                    return false;
                }
            }else if(ch == ']'){
                char poped = (char) stack.pop();
                if(poped != '['){
                    return false;
                }
            }else if(ch == '}'){
                char poped = (char) stack.pop();
                if(poped != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty() ; 
    }
}
