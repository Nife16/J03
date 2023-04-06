package weekTwo.Classes;

public class Practice {

    public static void main(String[] args) {

        // Creating a new object of my dog class, called peace, all values are null
        Dog peace = new Dog();
        // Creating another dog object, called glory, all values are initially set
        Dog glory = new Dog("mutt", "lazy dog",
         140.3, "brown", "gentle giant");
        
        System.out.println(glory.toString());

    }


}
