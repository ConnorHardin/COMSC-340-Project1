/*
 * Author: Connor Hardin
 * Class: COMSC340
 * Program Name: MatrixMultiplication.java
 * Description: Multiplication Matrix Algorithm
*/

import java.util.Random;

public class MatrixMultiplication{

	//Method to generate a matrix with numbers 0-9 and a size of n x n
    public static int[][] generateMatrix(int n) 
    {
        Random random = new Random();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                matrix[i][j] = random.nextInt(10); 
            }
        }
        return matrix;
    }

    //Performs matrix multiplication for matrix A and B
    public static int[][] matrixMultiplication(int n, int[][] A, int[][] B) 
    {
    	//Initialize result matrix
        int[][] C = new int[n][n];
        
        //Start timer measured in nanoseconds
        double startTime = System.nanoTime();

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                for (int k = 0; k < n; k++) 
                {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        //Stop timer
        double endTime = System.nanoTime();
        
        //Calculate time in Nanoseconds and Seconds
        double timeNano = endTime - startTime;
        double timeSeconds = timeNano / 1000000000;

        //Print statements with input size and execution time
        System.out.println("Input Size: " + n);
        System.out.println("Execution time: " + String.format("%,.9f", timeSeconds) + " seconds or " + String.format("%,.1f", timeNano) + " nanoseconds");

        return C;
    }

    //Main function to test different inputs
    public static void main(String[] args) 
    {
    	//Used four different input sizes
        int[] inputSizes = {25, 50, 100, 150};

        for (int n : inputSizes) 
        {
        	//Generate matrix A and B
            int[][] A = generateMatrix(n);
            int[][] B = generateMatrix(n);
            
            //Perform matrix multiplication
            int[][] result = matrixMultiplication(n, A, B);
        }
    }
}

