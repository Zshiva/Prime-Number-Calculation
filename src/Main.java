public class Main {
    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int i = 2; i < wholeNumber; i++) {
            if (wholeNumber % i == 0) {
                return false;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(0) ? "" : "NOT" ) + " a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT" ) + " a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT" ) + " a prime number");
        System.out.println("22 is " + (isPrime(22) ? "" : "NOT" ) + " a prime number");
        System.out.println("16 is " + (isPrime(16) ? "" : "NOT" ) + " a prime number");
        System.out.println("23 is " + (isPrime(23) ? "" : "NOT" ) + " a prime number");

    }
}