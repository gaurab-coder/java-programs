public class StringBufferCapacityExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        sb.append(" Programming in Java");

        System.out.println("New Length: " + sb.length());
        System.out.println("New Capacity: " + sb.capacity());
    }
}