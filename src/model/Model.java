package model;

import java.util.ArrayList;
import java.util.List;

public class Model {

    static int count = 0;
    static int sumOfPrimes = 0;
    private static List primes;

    public Model() {
        primes = new ArrayList<>();
        calculatePrimes(2,1000);
    }
    static boolean numIsPrime(int current, float stop, int depth) {
        int divisibleBy = depth == 0 ? 2 : (Integer) primes.get(depth);
        if(divisibleBy > stop){
            return true;
        }else if (current % divisibleBy == 0) {
            return false;
        }
        return numIsPrime(current, stop, ++depth);
    }

    static void calculatePrimes(int current, int stop) {
        if (current > stop) {
            primes.add(count);
            primes.add(sumOfPrimes);
        } else if (numIsPrime(current, current / 2.0f, 0)) {
            primes.add(current);
            ++count;
            sumOfPrimes += current;
            calculatePrimes(++current, stop);
        } else {
            calculatePrimes(++current, stop);
        }
    }
    public List<Integer> getPrimes() {
        return primes;
    }
}
