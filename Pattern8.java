public class Pattern8 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >=1 ; i--) {
            // Print leading spaces
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print(" ");
            }
           // Print stars
            for (int j = 1; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }
            
             
            System.out.println();
        }
    }
}
