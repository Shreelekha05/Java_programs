package assess1;
public class largestnum {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please provide exactly 9 integers as command-line arguments.");
            return;
        }
        int[][][] array = new int[1][3][3]; // 3D array with 1 depth layer
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[0][i][j] = Integer.parseInt(args[k]);
                k++;
            }
        }
        System.out.println("3D Array (only 1 depth slice):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[0][i][j] + " ");
            }
            System.out.println();
        }
        int max = array[0][0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[0][i][j] > max) {
                    max = array[0][i][j];
                }
            }
        }
        System.out.println("The biggest number in the 3x3 array is: " + max);
    }
}
