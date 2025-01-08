public class project {
    public static void main(String[] args) {
        // String name = "cleopas";
        // System.out.println("hello world");
        // System.out.println("the number of characters in the word is  " + name.length());
        // System.out.println(name.toUpperCase());

        

        String[] cars = { "an", "bn", "cn", "dn", "en" };

        // for (String i : cars) {
        //     System.out.println(i);
        // }
        // for (int i = 0; i < cars.length; i++) {
        //     System.out.println(cars[i]);
        //     System.out.println(cars.length);

        // }
        int[] age = { 56, 74, 94, 38 };
        int[] randomNumber = {45,34,343,343,3434,343,343,343};

        int sumOfAges = addition(age);
        int sumOfRandomNumbers = addition(randomNumber);

        System.out.println(" the sum of the ages "+ sumOfAges );
        System.out.println("the sum of the random number "+sumOfRandomNumbers);


        //calling a method with return value
        int returnAverageValue = returnAverage(age);
        System.out.println("printing the return average method "+returnAverageValue);


        //calling a void method
        printAverage(randomNumber);

        // int[][] marks = { { 45, 89, 62, 27, 27 }, { 45, 74, 37, 38 } };

        // for (int i = 0; i < marks.length; i++)
        //     for (int j = 0; j < marks.length; j++) {
        //         System.out.println(marks[i][j]);
        //     }
        // int rows = marks.length;
        // int column = marks[0].length;
        // for (int i = 0; i < rows; i++)
        //     for (int j = 0; j < column; j++) {
        //         System.out.println(marks[i][j]);

        //     }
        

    }

    //method to add 2 integers
    static int addition(int[] values) {
        int sum = 0;
        for(int i =0; i < values.length; i++){
            sum = sum + values[i];
        }
        return sum;
    }

    //method to return average of values in an int array
    static int returnAverage(int[] values){
        int sum = addition(values);
        int average = sum / values.length;
        return average;
    }

     //method to print average of values in an int array
    static void printAverage(int[] values){
        int sum = 0;
        for(int i =0; i < values.length; i++){
            sum = sum + values[i];
        }
        int average = sum / values.length;
         System.out.println("printing average from void method "+average);
    }

    //metho sto compare 2 ages

}
