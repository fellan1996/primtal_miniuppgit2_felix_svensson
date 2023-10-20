public class Main {
    static int count = 0;
    static int sumOfPrimes = 0;
    public static void main(String[] args) {

        displayPrimes(1000);

    }

    static boolean numIsPrime(int i, int j) {
        if (j == 1) {
            return true;
        } else if (i % j == 0) {
            return false;
        }
        return numIsPrime(i, --j);
    }

    static void displayPrimes(int i) {
        if (i == 1) {
            System.out.println("No more primes. Count: " + count);
            System.out.println("Total sum of all primes: " + sumOfPrimes);
        } else if (numIsPrime(i, i / 2)) {
            System.out.println(i);
            ++count;
            sumOfPrimes += i;
            displayPrimes(--i);
        } else {
            displayPrimes(--i);
        }
    }
}