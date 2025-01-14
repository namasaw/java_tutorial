import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
public class project {

    int x = 64;

    public static void main(String[] args) {
          int age =callArray();

            School lugulu=new School();
            lugulu.setSchoolLocation("BUNGOMA");
            System.out.println(lugulu.getSchoolLocation());
            


        
            ArrayList<String> bikes=new ArrayList<String>();
            bikes.add("tvs");
            bikes.add("bajaj");
            System.out.println(bikes);
            System.out.println(bikes.get(1));
            bikes.set(0,"boxer");
            System.out.println(bikes.get(0));
            Collections.sort(bikes);
            for(String i:bikes)
            System.out.println(i) ;

    
        
    
        //local date time class with now method implemented
        //LocalDateTime myObj4=LocalDateTime.now();
        //System.out.println(myObj4);
        //scanner class implemeented
       // Scanner myObj3 = new Scanner(System.in);
    System.out.println("enter username");
    //String userName=myObj3.nextLine();
    //System.out.println("username is "+userName);
    
        
        //this comment is usedto check if changes have been made in the git repository
         //project myObj2 = new project();
        //setting the values
        //myObj2.age(45);

        // staticMethod();
        // project yourObject = new project();
        // yourObject.publicMethod();
        // project myObject = new project();
        // myObject.x = 78;
        // System.out.println(myObject.x);
        // int sum = add(10);
        // System.out.println("the sum of first 10 numbers is " + sum);

        // int product = multi(42, 72);

        // System.out.println("the product of the twonumbers is " + product);
        // int[] age = { 56, 74, 94, 38 };
        // int[] randomNumber = { 45, 34, 343, 343, 3434, 343, 343, 343 };

        // int sumOfAges = addition(age);
        // int sumOfRandomNumbers = addition(randomNumber);

        // System.out.println(" the sum of the ages " + sumOfAges);
        // System.out.println("the sum of the random number " + sumOfRandomNumbers);

        // // calling a method with return value
        // int returnAverageValue = returnAverage(age);
        // System.out.println("printing the return average method " + returnAverageValue);

        // // calling a void method
        // printAverage(randomNumber);

        // // int[][] marks = { { 45, 89, 62, 27, 27 }, { 45, 74, 37, 38 } };

        // // for (int i = 0; i < marks.length; i++)
        // // for (int j = 0; j < marks.length; j++) {
        // // System.out.println(marks[i][j]);
        // // }
        // // int rows = marks.length;
        // // int column = marks[0].length;
        // // for (int i = 0; i < rows; i++)
        // // for (int j = 0; j < column; j++) {
        // // System.out.println(marks[i][j]);

        // // }

        Engine volvoEngine = new Engine();
        volvoEngine.setCapacity(2);
        volvoEngine.setFuel("Petrol");

        Car volvo = new Car("volvo");
        volvo.setColor("green");
       // volvo.setEngine(volvoEngine);

        System.out.println("the color of our volvo is "+ volvo.getColor());

        volvo.drive();;

        Wheels pireli=new Wheels();
        pireli.setSize(18);
        System.out.println("the size of wheel is "+ pireli.getSize());


        int[] marks={76,78,90};
    }

    // method to add 2 integers
    static int addition(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        return sum;
    }

    // method to return average of values in an int array
    static int returnAverage(int[] values) {
        int sum = addition(values);
        int average = sum / values.length;
        return average;
    }

    // method to print average of values in an int array
    static void printAverage(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        int average = sum / values.length;
        System.out.println("printing average from void method " + average);
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static int add(int k) {
        if (k > 0) {
            return k + add(k - 1);
        } else {
            return 0;
        }
    }

    // creating a static method
    static void staticMethod() {
        System.out.println("Here you can access this method without creating an object of the class");
    }

    // writting a public method
    public void publicMethod() {
        System.out.println("Here you need to create an object of the class before calling the method");

    }

}

// metho sto compare 2 ages
