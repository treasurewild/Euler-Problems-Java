import java.util.ArrayList;

public class Functions {

    public static int[] getPrimes(int size) {
        int[] primes = new int[size];
        primes[0] = 2;
        primes[1] = 3;


        for(int i = 5; i < Math.pow(size,2); i++) {
            for (int j = 0; j < size; j++) {

                if (primes[j] == 0) {
                    primes[j] = i;
                    break;
                }
                if(i % primes[j] == 0)
                    break;
            }
        }

        return primes;
    }

    public static int[] triangularNumbers(int n) {
        // Returns the first n triangular numbers;

        int[] triangularNumbers = new int[n];
        triangularNumbers[0] = 1;

        for(int i = 2; i <= n; i++ ) {
            triangularNumbers[i - 1] = triangularNumbers[i-2] + i;
        }
        for(int number: triangularNumbers)
            System.out.println(number);
        return triangularNumbers;
    }
}
