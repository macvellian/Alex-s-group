#include <iostream>

int main()
{
    // Fibonacci base cases:
    int a = 0, b = 1;
    int sum_even = 0;
    // Calculate fib numbers 0 to 4000000
    while (b < 4000000) {
        if (b % 2 == 0) {
            sum_even += b;
        }
        int temp = b;
        b = a + b;
        a = temp;
    }
    std::cout << sum_even << std::endl;

    return 0;
}

// answer should be 4613732
