public class JAVA_TEST_0003 {
    public static void main(String[] args) {
        for (int row = 1; row <= 6; row++) {
            for (int col = 0; col < row; col++) {
                int value = (row + col) % 2;
                if (col == 0) {
                    System.out.print(value);
                } else {
                    System.out.print(" " + value);
                }
            }
            System.out.println();
        }
    }
}