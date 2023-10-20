package model;

import java.util.ArrayList;
import java.util.List;

public class Model {

    static int count = 0;
    static int sumOfPrimes = 0;
    private static List primes;

    public Model() {
        primes = new ArrayList<>();
        calculatePrimes(1000);
    }
    static boolean numIsPrime(int i, int j) {
        if (j == 1) {
            return true;
        } else if (i % j == 0) {
            return false;
        }
        return numIsPrime(i, --j);
    }

    static void calculatePrimes(int i) {
        if (i == 1) {
            primes.add(count);
            primes.add(sumOfPrimes);
        } else if (numIsPrime(i, i / 2)) {
            primes.add(i);
            ++count;
            sumOfPrimes += i;
            calculatePrimes(--i);
        } else {
            calculatePrimes(--i);
        }
    }
    public List<Integer> getPrimes() {
        return primes;
    }
}
