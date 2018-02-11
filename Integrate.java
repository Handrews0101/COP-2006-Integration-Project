import java.util.Scanner;



// Hannah Andrews 

// Integration Project COP 2006

// The first part of my project, simply demonstrates 
// concepts we have used in class and as it grows will 
// grow into something useful and amazing

public class Integrate {
    
    private String field;
    
    // constructor
    public Integrate() {
        
    }
    
	public String getField() {
		return field;
	}
    
    public void setField(String field) {
        this.field = field;
    }
    
    public static int subtractNumbers(int x, int y) {
        int result = 0;
        result = x - y;
        return result;
    }
    
	public static void main (String [] args) {
        // This part of the code will say hello using a variety of questions to ensure the user is human
        
        System.out.println();
        Scanner scanner = new Scanner(System.in);
		System.out.println("Occupy Mars! To ensure you are not a robot, we'll need the following info");
        System.out.println();
        
		System.out.print("Type in your full name: ");
        String myName = scanner.nextLine();
        
		System.out.print("Type your age: ");
        int myAge = scanner.nextInt();
        
		System.out.print("What is 5/2?: ");
        double myHuman = scanner.nextDouble();
        
        System.out.println();
        
        System.out.println("My Name is: " + myName);
        System.out.println("My age is: " + myAge);
        System.out.println("I am not an robot.. 5/2 = " + myHuman);
        
        System.out.println();
        System.out.println("Now we'll perform some math operations!");
        System.out.println("4 + 5 is: " + (4 + 5));
        System.out.println("15 - 3 is: " + (15 - 3));
        System.out.println("15 / 4 is: " + (15 / 4));
        System.out.println("4 * 5 is: " + (4 * 5));
        System.out.println("5 % 3 is: " + (5 % 3));
        
        // rubric part create java classes and use object references
        // corresponding Integration object is created
        Integrate integration_object = new Integrate();
        
        // string methods
        System.out.println();
        System.out.println("Now we'll manipulate some of string data you entered...");
        System.out.println("Your name in uppercase is: " + myName.toUpperCase());
        System.out.println("The second letter in your name is: " + myName.substring(1,2));
        System.out.println("This is your name without vowels: " + myName.replaceAll("[AEIOUaeiou]", ""));
        
        // method call with type casting
        System.out.println();
        System.out.println("Now time for you to do some math operations!");
        System.out.print("Enter a number: ");
        int first_num = scanner.nextInt();
        System.out.print("Enter another number: ");
        int second_num = scanner.nextInt();
        
        System.out.println();
        System.out.print("Now I'll call a method to do some cool stuff for you.");
        System.out.println();
        System.out.println();
        
        System.out.println("The result of the subtraction of your two numbers is: " + subtractNumbers(first_num, second_num));
        System.out.println("Let's cast that as a double so that your result becomes: " + (double)(subtractNumbers(first_num, second_num)));
        
        System.out.println();
        System.out.println("We're all done! Have a great day!");
        System.out.println();
		

}
}
