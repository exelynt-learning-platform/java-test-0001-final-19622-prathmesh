
public class JAVA_TEST_0002 {
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 1; i <= n; i++) {
            for (int space = 0; space < (n - i) * 2; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" ");
                }
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}