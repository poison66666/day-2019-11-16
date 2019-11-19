
import java.util.Stack;

public class isValid {

    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
       for(char c : s.toCharArray()) {

           switch(c) {
               case'(':
               case'[':
               case'{':
                   stack.push(c);
                   break;
               case')':
               case']':
               case'}': {
                   if (stack.empty()) {
                       return false;
                   }
                   char left = stack.pop();
                   if(!((left == '(' && c == ')') || (left == '[' && c ==']')|| (left == '{'&& c == '}'))){
                       return false;
                   }
                   break;
               }
               default:
                   break;
           }
       }
       if(!(stack.isEmpty())) {
           return false;
       }
       return true;
    }

    public static void main(String[] args) {
        System.out.println(new isValid().isValid("({})"));

    }
}
