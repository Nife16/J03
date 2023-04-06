package weekTwo.Classes;

/*  This class isn't one that you put a main method in it\
 *  The purpose it to make your own data type, where you define
 *  its variables (the values your object will have)
 *  and its functions (what the object can do)
 *  In your main, you can create an object (Dog dog = new Dog();)
 *  to use in your application as needed.
 */
public class Dog {

    /* The variables usually describe the important information of your class
     * Based on the application and what you are being asked to do you pick
     * the necessary info needed and select the appropriate datatype for it
     * ALL DATATYPES IN THESE FILES SHOULD BE USING THE CLASS VERSION (ex:Integer, not int or ex:Boolean, not boolean)
     * ALL VARIABLES ON A CLASS SHOULD BE PRIVATE!!!!! ENCAPSULATION!!!!!
     */
    private String breed;
    private String type;
    private Double weight;
    private String color;
    private String behavior;

    /* These two functions below with no return type or void constructor,
     * you use this in your main file to actually
     * instantiate (fancy way to say make a variable) of your object
     * ex: Dog dog = new Dog(); the new Dog(); code is making a new object with that constructor
     */
    public Dog() {
    }

    /* Some constructors no arguments, some have more.
     * The constructor above will create a Dog object with all its variables being null
     * The constructor below will create a Dog object, and you will give it values
     * are arguments to initialize the variables on construction
     * ex: Dog dog = new Dog("good boy", "jussa good boy", 92.3, "black", "good boy behavior");
     * YOU MUST PASS THE ARGUMENTS IN THE ORDER YOU DECLARE THEM IN THE CONSTRUCTOR
     * The way you decide whats in the args are basically asking:
     * Is this information necessary to create the object? Or can i get the info later
     * (It really depends on the application and what you wanna do)
     */
    public Dog(String breed, String type, Double weight, String color, String behavior) {
        /* The 'this' keyword is used to refer to a classes variable
         * above you see the variables in the arguments have the same name as
         * the classes variables (which ARE in scope here since they aren't in a function)
         * this. helps you differentiate between the class variable and the argument
         */
        this.breed = breed;
        this.type = type;
        this.weight = weight;
        this.color = color;
        this.behavior = behavior;
    }

    public void bark(String sound) {
        System.out.println(sound);
    }

    public static void sleep() {
        System.out.println("snore snore");
    }

    public static void eat() {
        System.out.println("chomp chomp");
    }


    /* 
     * Below you see all the GETTERS and SETTERS
     * you must generate these after creating your variables, ENCAPSULATION!!!!!
     * Since i know you are a good dev, you make your class variables private
     * public getters and setters and what allow you to actually access or mutate
     * the classes variables. Its a code practice you MUST do (ENCAPSULATION!!!!!!!a)
     */
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBehavior() {
        return behavior;
    }
    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    /*
     * This is a toString, you generate this just like getters and setters
     * Its purpose it so you can display your classes information,
     * normally when you println a object, you get a signature, not the values
     * This method also is OVERRIDING, by default the Object class in java extends its
     * toString method to every single class (Even the ones you make) but its useless
     * so we make one for ourself to override what we get from the parent Object class
     */
    @Override
    public String toString() {
        return "Dog [breed=" + breed + ", type=" + type + ", weight=" + weight + ", color=" + color + ", behavior="
                + behavior + "]";
    }

    /*
     * These are OVERLOADED methods down below, 
     * when you have more than one function in a class with the same name,
     * but different arguments
     */
    public void fryChicken() {
        System.out.println("poof its fried");   
    }

    public void fryChicken(int number) {
        System.out.println("air fryer that mug");
    }

    public void fryChicken(String number) {
        System.out.println("oven fried somehow");
    }

    public void fryChicken(int number, String anotherNumber) {
        System.out.println("deep dish dandy fried");
    }
}
