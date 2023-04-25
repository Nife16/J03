package weekTwo.Classes;

public class Practice {

    public static void main(String[] args) {

        findEvenDivisors(100);

    }

    // Write a method to print out all the even divisors of a number
    // print none if none are found

    public static void findEvenDivisors(int number) {

        for (int i = 2; i < number; i++) {
            if(number%i == 0 && i%2==0) {
                System.out.println((i));
            }
        }

    }



    // Write a method to find the smallest element of an array

    public static void smolElement(int[] numArray) {

        int number = Integer.MAX_VALUE;
        for (int i = 0; i < numArray.length; i++) {
            
            if(numArray[i] < number) {
                number = numArray[i];
            }

        }
        System.out.println(number);

    }

    // Write a method that will find the biggest product of 2 adjacent elements
    // in an array


}
