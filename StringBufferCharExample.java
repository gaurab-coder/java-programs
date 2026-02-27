public class StringBufferCharExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        // Get character
        System.out.println("Character at index 1: " + sb.charAt(1));

        // Change character
        sb.setCharAt(1, 'O');

        System.out.println("After change: " + sb);
    }
}