package project1;

import java.util.Scanner;

public class scalar_multiplication {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Choose whether to pick the row and column amount
        System.out.print("Do you want to pick the row and column amount? y or n: ");
        String answer = scanner.next().toLowerCase();
        
        System.out.print("\nPick the range for your random number: ");
        int randomrange = scanner.nextInt();
        
        int row;
        int column;
        
        if (answer.equals("y")) {

        	//get size for matrix
        	System.out.print("\nEnter the row size of the matrix: ");
        	row = scanner.nextInt();
		
        	System.out.print("\nEnter the column size of the matrix: ");
        	column = scanner.nextInt();
        }
        else {
            row = (int) (Math.random() * randomrange);
            column = (int) (Math.random() * randomrange);
        }
		

        
        
		//create empty matrix's given size
		int[][] A = new int[row][column];
		int[][] C = new int[row][column];
		

		
        // Fill matrix with input or random values    
		System.out.print("\nDo you want to fill in the matrix? (y/n): ");
        answer = scanner.next().toLowerCase();
        
        if (answer.equals("y")) {
        	//fill matrix with input from user
        	System.out.println("\nEnter the elements of your matrix:");
        	for (int i = 0; i < row; i++) {
        		for (int j = 0; j < column; j++) {
        			System.out.print("A[" + i + "][" + j + "]: ");
        			A[i][j] = scanner.nextInt();
        		}
        	}
        }
        else {
        	for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    A[i][j] = (int)(Math.random() * randomrange);
                }
            }
        }
        
        
		// Input scalar value
		System.out.print("\nEnter the scalar value: ");
		int scalar = scanner.nextInt();
	    
		
		
		
		//start time
        long startTime = System.nanoTime();

		// Perform scalar matrix multiplication
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				C[i][j] = A[i][j] * scalar;
		    }
	    }
		
        //endtime
		long endTime = System.nanoTime();
        long duration = endTime - startTime;

		
		// Print
		System.out.println("\nHeres your old matrix:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("\nHeres your new matrix:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		
        System.out.println("\nAlgorithm runtime: " + duration + " nanoseconds");
        System.out.println("Your matrix was a " + row +" by "+ column);
        System.out.println("Your Scalar was: "+ scalar);

	}
}
