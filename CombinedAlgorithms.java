import java.util.Random;

public class CombinedAlgorithms {

    // Sum Array algorithm
    public static int sumArrayMembers(int[] arr) {
        double startTime = System.nanoTime(); // Start the timer

        // Sum Array algorithm
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double endTime = System.nanoTime(); // End the timer
        // Nanoseconds to seconds
        double duration = (endTime - startTime);
        System.out.println("Execution time: " + duration + " ns");

        // Nanoseconds to seconds
        double timeSeconds = duration / 1000000000;
        System.out.println("Execution time: " + String.format("%,.9f", timeSeconds) + " seconds or " + String.format("%,.1f", duration) + " nanoseconds");

        return sum;
    }

    // scalar_multiplication algorithm
    public static void scalar_multiplication(int[] arr, int scalar) {
        int row;
        int column;
        int randomrange = arr.length;

        row = (int) (Math.random() * randomrange);
        column = (int) (Math.random() * randomrange);

        //create empty matrix's given size
        int[][] A = new int[row][column];
        int[][] C = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                A[i][j] = (int) (Math.random() * randomrange);
            }
        }

        double startTime = System.nanoTime(); // Start the timer

        // Perform scalar multiplication
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                C[i][j] = A[i][j] * scalar;
            }
        }

        double endTime = System.nanoTime(); // End the timer

        double duration = (endTime - startTime);
        // Nanoseconds to seconds
        double timeSeconds = duration / 1000000000;

//        // Print old matrix
//        System.out.println("Old Matrix: ");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.print(A[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        // Print new matrix
//        System.out.println("New Matrix: ");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.print(C[i][j] + " ");
//            }
//            System.out.println();
//        }


        //Print statements with input size and execution time
        System.out.println("Input Size: " + row + "x" + column);
        System.out.println("Execution time: " + String.format("%,.9f", timeSeconds) + " seconds or " + String.format("%,.1f", duration) + " nanoseconds");
        System.out.println("Scalar multiplier is " + scalar);

    }

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
    public static void matrixMultiplication(int n, int[][] A, int[][] B)
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
        // Nanoseconds to seconds
        double timeSeconds = timeNano / 1000000000;

        //Print statements with input size and execution time
        System.out.println("Input Size: " + n);
        System.out.println("Execution time: " + String.format("%,.9f", timeSeconds) + " seconds or " + String.format("%,.1f", timeNano) + " nanoseconds");

    }

    public static void main(String[] args) {
        // Test each algorithm with 3 different cases (n = 100, 1000, 10000)
        int[] arr1 = new int[100];
        int[] arr2 = new int[1000];
        int[] arr3 = new int[10000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i + 1;
        }

        // Test algorithmOne
        System.out.println("Algorithm 1");
        System.out.println("Size of array: " + arr1.length);
        System.out.println(sumArrayMembers(arr1));
        System.out.println("Size of array: " + arr2.length);
        System.out.println(sumArrayMembers(arr2));
        System.out.println("Size of array: " + arr3.length);
        System.out.println(sumArrayMembers(arr3));

        // Test scalar_multiplication
        System.out.println("Scalar Multiplication");
        scalar_multiplication(arr1, 5);
        scalar_multiplication(arr2, 5);
        scalar_multiplication(arr3, 5);

        // Test matrixMultiplication
        System.out.println("Matrix Multiplication");
        int[][] matrix1 = generateMatrix(100);
        int[][] matrix2 = generateMatrix(100);
        int[][] matrix3 = generateMatrix(100);
        matrixMultiplication(10, matrix1, matrix2);
        matrixMultiplication(50, matrix2, matrix3);
        matrixMultiplication(100, matrix3, matrix1);


    }

}