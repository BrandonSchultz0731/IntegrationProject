import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
  
  Stack<Character> stack = new Stack<>();
  Queue<Character> queue = new LinkedList<>();
 
 
  void pushCharacter(char c){
     stack.push(c);
 }
  void enqueueCharacter(char c){
     queue.add(c);
 }
  char popCharacter(){
     return stack.pop();
     
 }
  char dequeueCharacter(){
     return queue.remove();
 }

}
