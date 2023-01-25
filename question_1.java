package midJan;
import java.util.*;

public class question_1 {
	private static boolean checkVariable(char c) {
	if(c>='a' &&c<='z'){
		 return true;
		}
		return false;
		}
	
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the mathematical expression");
	 String input=sc.nextLine();
	 Stack<Character> stack=new Stack<>();//using stack
	 for(int i=0;i<input.length();i++){
	 
		 if(input.charAt(i)==')'){
	 
		 if(stack.peek()!='('){
	 System.out.println("invalid");
	 return;
	 }
	 stack.pop();
	 }
	 
	 else if(input.charAt(i)=='+' || input.charAt(i)=='-' || input.charAt(i)=='*' || input.charAt(i)=='/'){
	 if( !checkVariable(stack.peek()) || !checkVariable(input.charAt(i+1))){
	 System.out.println("invalid");
	 return;
     }
	 
	 else
	 {
         stack.pop();
         i++;
     }
 }
	 else{
     stack.push(input.charAt(i));
 }
}
if(stack.isEmpty()){
 System.out.println("valid");
 return;
}
 System.out.println("invalid");

}

}


