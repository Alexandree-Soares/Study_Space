import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r, c, x, conclusion;

        System.out.println("Type a number for the rows and columns: ");
        r = sc.nextInt();
        System.out.println("Type a number for de columns: ");
        c = sc.nextInt();
        System.out.println("type the numbers: ");

        int[][] mat = new int[r][c];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();

            }

        }

        System.out.println("Enter a number located in the array");
        x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);

                        if (i > 0) {
                            System.out.println("Up: " + mat[i - 1][j]);
                        }
                        if (j < mat.length - 1) {
                            System.out.println("Right: " + mat[i][j + 1]);
                        }
                        if (i < mat.length -1){
                            System.out.println("Down: " + mat[i + 1][j]);
                        }

                    }
                }
            }

        }


        sc.close();

    }
}