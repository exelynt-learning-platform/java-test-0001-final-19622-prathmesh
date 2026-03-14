public class JAVA_TEST_0001 {
    public static void main(String[] args) {
        int n = 5; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            // First asterisk
            System.out.print("*");

            if (i > 0) {
                int gap = 2 * i - 1; 
                for (int j = 0; j < gap; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half of the diamond
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if (i > 0) {
                int gap = 2 * i - 1;
                for (int j = 0; j < gap; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}