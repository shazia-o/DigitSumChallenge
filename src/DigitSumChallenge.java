public class DigitSumChallenge {
    //This is a simple program that calculates the sum of all the digits in a number

    public static void main(String[] args) {
        System.out.println("The sum of the digits in 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in 32123 is " + sumDigits(32123));
        System.out.println("The sum of the digits in 0 is " + sumDigits(0));
    }

    public static int sumDigits(int number) {

        if (number < 0) return -1; //return -1 if invalid (negative number)
        int sum = 0;
        while (number != 0) {
            sum += (number % 10);
            number = number / 10;
        }
        return sum;
    }

}
