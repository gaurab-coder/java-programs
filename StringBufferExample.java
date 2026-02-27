public class StringBufferExample {
    public static void main(String[] args) {
        
        // Creating StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append (add text at end)
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert (add text at specific position)
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // Replace (replace characters)
        sb.replace(6, 10, "Programming");
        System.out.println("After replace: " + sb);

        // Delete (remove characters)
        sb.delete(6, 17);
        System.out.println("After delete: " + sb);

        // Reverse (reverse string)
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}