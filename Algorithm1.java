////////////////////////////////////////////////////////////////
// Name: Aidan Connaughton
// Date: 2/22/2024
// Course: COMSC340
// Program: Algorithm1.java
// Description: This program times the execution of the Add Array Members algorithm and outputs the time in nanoseconds
////////////////////////////////////////////////////////////////

public class Algorithm1 {
    // Method to sum the elements of an array
    public static int sumArray(int[] arr) {
        long startTime = System.nanoTime(); // Start the timer

        // Sum Array algorithm
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        long endTime = System.nanoTime(); // End the timer
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
        return sum;
    }

    public static void main(String[] args) {
        // Array with elements 1 to X
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        // Print the sum of the array
        System.out.println("Size of array: " + arr.length);
        System.out.println(sumArray(arr));
    }

}