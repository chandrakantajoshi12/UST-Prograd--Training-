import  java.util.Stack;
public class Catrin {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("Plate1");
        stack.push("PLate2");
        stack.push("Plate3");
        stack.push("Plate4");
        stack.pop();
        stack.search(2);
        System.out.println(stack.indexOf("Plate1"));
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
