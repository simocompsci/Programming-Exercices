import java.util.Stack;

public class StackDsa {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("simon");
        stack.push("hanan");
        stack.push("mounir");
        stack.push("kratos");
        stack.isEmpty();
        stack.pop(); // remove the top and return it 
        stack.peek(); // just look at it with no removal
        stack.search("hanan"); // returns the index of the object we want
        System.out.println(stack.search("simon"));
        System.out.println(stack);

        // uses of stack?
        // undo/redo features in text editors
        // moving back/forward through browser history
        // backtracking algorithms (maze , file direcories)
        // calling functions (call stack)
    }
}
