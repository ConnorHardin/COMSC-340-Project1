# -*- coding: utf-8 -*-
"""
Author: Connor Hardin
Class: COMSC340
Program Name: MatrixMultiplication.py
Description: Multiplication Matrix Algorithm
"""

import random
import time

#Method to generate a matrix with numbers from 0-9 and a size of n x n
def generate_matrix(n):
    return [[random.randint(0, 9) for _ in range(n)] for _ in range(n)]


#Performs matrix multiplication for matrix A and B
def matrix_multiplication(n, A, B):

    #Fill result matrix with zeros
    C = [[0 for _ in range(n)] for _ in range(n)]  
  
    #Start timer measured in nanoseconds
    start_time = time.time_ns()

    for i in range(n):
        for j in range(n):
            for k in range(n):
                C[i][j] += A[i][k] * B[k][j]

    #Stop timer
    end_time = time.time_ns()

    #Return result and execution time
    return C, end_time - start_time


#Main function to test different inputs
def main():

    #Used four different input sizes
    input_sizes = [25, 50, 100, 150]

    for n in input_sizes:
        #Generate matrix A and B
        A = generate_matrix(n)
        B = generate_matrix(n)

        #Perform matrix multiplication and measure time
        result, time_ns = matrix_multiplication(n, A, B)

        #Convert nanoseconds to seconds
        time_s = time_ns / 1000000000
        print(f"Input size: {n}")
        print(f"Execution time: {time_ns:} nanoseconds or {time_s:} seconds")

if __name__ == "__main__":
    main()



