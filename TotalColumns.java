import java.util.Scanner;

public class TotalColumns {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        Scanner input = new Scanner(System.in);
        //input
        System.out.println("Input matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter matrix["+i+ "," +j+ "]:");
                matrix[i][j] = input.nextInt();
            }
        }
        //display
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //Sum for columns
        for (int j = 0; j < matrix[0].length; j++) {
            int total = 0;
            for (int i = 0; i < matrix.length; i++)
                total += matrix[i][j];
            System.out.println("Sum for columns " + j + " is "
                    + total);
        }
    }
}
