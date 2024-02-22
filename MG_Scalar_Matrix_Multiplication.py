# -*- coding: utf-8 -*-
"""
Created on Wed Feb 21 20:47:38 2024

@author: guaman
"""


#pick the number of rows/colums or random
answer = input("\nDo you want to pick the row and column ammount? y or n: ")
randomrange = int(input("\nPick the range for your random number: "));

import random
import time


if answer.lower() == "y":
    row = int(input("\nEnter the row size of the matrix: "))
    column = int(input("\nEnter the column size of the matrix: "))
else:
    row = int(random.uniform(0, randomrange))
    column = int(random.uniform(0, randomrange))




#fill empty matrix A with 0
A = [[0 for _ in range(column)] for _ in range(row)]
C = [[0 for _ in range(column)] for _ in range(row)]



    
    
# fill matrix with random or pick 
answer = input("\nDo you want to fill in the matrix? y or n: ")
if answer.lower() == "y":
    # fill matrix A with user input
    print("\nEnter the elements of your matrix:")
    for i in range(row):
        for j in range(column):
            A[i][j] = int(input(f"A[{i}][{j}]: "))
else:
    for i in range(row):
        for j in range(column):
            A[i][j] = int(random.uniform(0, randomrange))



#get scalar value
scalar = int(input("\nEnter the scalar value: "))



#start time
start_time = time.perf_counter_ns()

#scalar matrix multiplication

for i in range(row):
    for j in range(column):
        C[i][j] = A[i][j] * scalar

#end time
end_time = time.perf_counter_ns()
duration = (end_time - start_time)

# Print the result
print("\nHere's your old matrix:")
for x in A:
    print(" ".join(map(str, x)))




print("\nHere's your new matrix:")
for x in C:
    print(" ".join(map(str, x)))
    
print(f" \nAlgorithm runtime: {duration} nanoseconds")
print(f"Your matrix was a {row} by {column}")
print(f"Your Scalar was: {scalar}")


