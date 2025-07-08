class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token:tokens){
            if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                int newnum = 0;
                switch(token){
                    case "+":
                        newnum = num2+num1;
                        break;
                    case "-":
                        newnum = num2-num1;
                        break;    
                    case "*":
                        newnum = num2*num1;
                        break;
                    case "/":
                        newnum = num2/num1;
                        break;
                }
                stack.push(newnum);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}