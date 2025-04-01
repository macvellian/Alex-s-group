public class sum_even_fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1; //a is first in fibanachi sequence b is second in fibonachi sequence
        int sumEven = 0;
        while (b < 4000000) { 
            if (b % 2 == 0) { //checks if b is even and if so it adds it to even sum 
                sumEven += b;
            }
            int temp = b; //temporary variable that holds b 
            b = a + b;
            a = temp; // sets a as temporary variable
        }
        System.out.println(sumEven); //prints the sum 
    }
}

// answer should be 4613732
