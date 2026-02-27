import java.util.Stack;
public class StackDemo {
    public static void main(String kakdjf[]) {
    Stack<Integer> stack =new Stack<Integer>();
    stack.push(34);
    stack.push(90);
    stack.push(2);
    stack.push(333);
    stack.push(76);
    System.out.println("Elements of  stack:"+stack);
    System.out.println("Element at top of stack:"+stack.peek());
    System.out.println("Position of element 76:"+stack.search(76));
    System.out.println("Position of element 90:"+stack.search(90));
    System.out.println();

    while(stack.size()>0)
    {
        System.out.println("Removed element:"+stack.pop());
    }
    System.out.println("Elements of stack:"+stack.empty());
}
}