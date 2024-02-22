////////////////////////////////////////////////////////////////
// Name: Aidan Connaughton
// Date: 2/22/2024
// Course: COMSC340
// Program: Algorithm1.cpp
// Description: This program times the execution of the Add Array Members algorithm and outputs the time in nanoseconds
////////////////////////////////////////////////////////////////

#include <iostream>
#include <numeric>
#include <vector>
#include <chrono>
using namespace std::chrono;

// Sum Array function
int sumArray(int arr[], int size) {
    auto start = high_resolution_clock::now();   // Get the starting time

    // Sum Array algorithm
    int sum = 0;
    for (int i = 0; i < size; i++) {
        sum = sum + arr[i];

    }

    auto stop = high_resolution_clock::now();   // Get the ending time
    auto duration = duration_cast<nanoseconds>(stop - start);  // Get the duration (nanoseconds)
    std::cout << "Execution time: " << duration.count() << " ns" << std::endl;

    return sum;
}

int main() {

    // Create an array of X size
    const int SIZE = 10000;
    std::vector<int> array(SIZE);

    // Fill the array with numbers from 1 to SIZE
    std::iota(array.begin(), array.end(), 1);


    // Print the sum of the array
    std::cout << "Array size: " << SIZE << std::endl;
    int sum = sumArray(array.data(), SIZE);
    std::cout << "Sum: " << sum << std::endl;

    return 0;
}