package assess1;
public class twodarray {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please provide exactly 4 integers as command-line arguments.");
            return;
        }
        int[][] array = new int[2][2];
        int k = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = Integer.parseInt(args[k]);
                k++;
            }
        }
        System.out.println("Original 2x2 Array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Reversed 2x2 Array:");
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
