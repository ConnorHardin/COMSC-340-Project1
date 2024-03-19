
import time
import random

# Function to sum all elements in an array
def sumArray(inputArray):
    # Start timer for algorithm
    start_time = time.perf_counter_ns()

    sum = 0
    # For function to sum all elements in array
    for i in range(len(inputArray)):
        sum = sum + inputArray[i]

    # End timer for algorithm (All elements have been summed)
    end_time = time.perf_counter_ns()
    # Calculate the time it took
    duration_ns = (end_time - start_time)

    timeTook = duration_ns

    # nanoseconds to seconds
    timeTookSeconds = timeTook / 1e9

    print("Input Size: ", len(inputArray))
    print("Execution time: ", timeTook, " nanoseconds ", "(", timeTookSeconds, " seconds )")

    return sum, timeTook

# Scalar Multiplication

def scalar_multiplication(arr, scalar):
    row = int(random.uniform(0, arr))
    column = int(random.uniform(0, arr))

    # fill empty matrix A with 0
    A = [[0 for _ in range(column)] for _ in range(row)]
    C = [[0 for _ in range(column)] for _ in range(row)]

    for i in range(row):
        for j in range(column):
            A[i][j] = int(random.uniform(0, arr))

    scalar = 5

    # start time
    start_time = time.perf_counter_ns()

    # scalar matrix multiplication

    for i in range(row):
        for j in range(column):
            C[i][j] = A[i][j] * scalar

    # end time
    end_time = time.perf_counter_ns()
    duration = (end_time - start_time)

    timeTook = duration

    # nanoseconds to seconds
    timeTookSeconds = timeTook / 1e9

    print("Input Size: ", row, "x", column)
    print("Execution time: ", timeTook, " nanoseconds ", "(", timeTookSeconds, " seconds )")
    print("Scalar multiplier is ", scalar)

    return C, timeTook

# Matrix Multiplication

#Method to generate a matrix with numbers from 0-9 and a size of n x n
def generate_matrix(n):
    return [[random.randint(0, 9) for _ in range(n)] for _ in range(n)]


# Performs matrix multiplication for matrix A and B
def matrix_multiplication(n, A, B):
    # Fill result matrix with zeros
    C = [[0 for _ in range(n)] for _ in range(n)]

    # Start timer measured in nanoseconds
    start_time = time.perf_counter_ns()

    for i in range(n):
        for j in range(n):
            for k in range(n):
                C[i][j] += A[i][k] * B[k][j]

    # Stop timer
    end_time = time.perf_counter_ns()

    # Calculate the time it took
    duration_ns = (end_time - start_time)

    timeTook = duration_ns

    # nanoseconds to seconds
    timeTookSeconds = timeTook / 1e9

    print("Input Size: ", n, "x", n)
    print("Execution time: ", timeTook, " nanoseconds ", "(", timeTookSeconds, " seconds )")

    # Return result and execution time
    return C, end_time - start_time

def main():
    # Test algorithm with three different input sizes (10, 100, 1000)
    # Test for sumArray

    print("Sum Array")
    print("----------")
    inputArray = [i for i in range(10)]
    sumArray(inputArray)
    print("----------")
    inputArray = [i for i in range(100)]
    sumArray(inputArray)
    print("----------")
    inputArray = [i for i in range(1000)]
    sumArray(inputArray)
    print("----------")

    # Test for scalar_multiplication
    print("Scalar Multiplication")
    print("----------")
    scalar_multiplication(10, 5)
    print("----------")
    scalar_multiplication(100, 5)
    print("----------")
    scalar_multiplication(1000, 5)
    print("----------")

    # Test for matrix_multiplication
    print("Matrix Multiplication")
    print("----------")
    n = 10
    A = generate_matrix(n)
    B = generate_matrix(n)
    matrix_multiplication(n, A, B)
    print("----------")
    n = 50
    A = generate_matrix(n)
    B = generate_matrix(n)
    matrix_multiplication(n, A, B)
    print("----------")
    n = 100
    A = generate_matrix(n)
    B = generate_matrix(n)
    matrix_multiplication(n, A, B)
    print("----------")



if __name__ == "__main__":
    main()
