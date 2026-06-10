package hust.soict.hedspi.lab01;
import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        int numRows = inputReader.nextInt();
        System.out.print("Input number of columns: ");
        int numCols = inputReader.nextInt();

        double[][] firstMatrix = new double[numRows][numCols];
        double[][] secondMatrix = new double[numRows][numCols];
        double[][] sumMatrix = new double[numRows][numCols];

        System.out.println("Fill data for the first matrix:");
        for (int r = 0; r < numRows; r = r + 1) {
            for (int c = 0; c < numCols; c = c + 1) {
                firstMatrix[r][c] = inputReader.nextDouble();
            }
        }

        System.out.println("Fill data for the second matrix:");
        int rowIdx = 0;
        while (rowIdx < numRows) {
            for (int colIdx = 0; colIdx < numCols; colIdx++) {
                secondMatrix[rowIdx][colIdx] = inputReader.nextDouble();
            }
            rowIdx++;
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                double tempSum = firstMatrix[i][j] + secondMatrix[i][j];
                sumMatrix[i][j] = tempSum;
            }
        }

        System.out.println("Resultant Matrix after addition:");
        for (int x = 0; x < numRows; x++) {
            for (int y = 0; y < numCols; y++) {
                System.out.print(sumMatrix[x][y] + " ");
            }
            System.out.print("\n");
        }
        
        inputReader.close();
    }
}
