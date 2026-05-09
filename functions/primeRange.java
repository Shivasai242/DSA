public class primeRange {
// Method to print primes in range
    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primesInRange(20);
    }
}
