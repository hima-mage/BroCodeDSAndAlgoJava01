/**
 * stack is
 * LIFO data Structure , Last-In First-Out
 * stores data in vertical data-structure
 * push() add element at the end of the stack
 * pop() remove element from the top
 *
 * use of stack
 *  1.undo/redo feature in text editors
 *  2.moving back/forward through browser history
 *  3.backtracking history algorithm Maze-file_dir
 *  4.calling function (call back)
 */
import  java.util.Stack;

public class StackImplmentation {


    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("MineCraft");
        stack.push("Doom");
        stack.push("Silkroad");
        stack.push("Pubg");

        System.out.println(stack.isEmpty());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.search("Doom"));


    }
}
