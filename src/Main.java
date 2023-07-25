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
        int count = 0;
        for(int i = 10; i<=50; i++){
            if(isPrime(i)){
                System.out.println(i + " is a prime Number");
                count++;
            }
        }
        System.out.println("Total number of prime numbers between 10 and 50 is " + count);
    }
}
