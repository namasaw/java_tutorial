public class project {
    public static void main(String[] args) {
        String name = "cleopas";
        System.out.println("hello world");
        System.out.println("the number of characters in the word is  " + name.length());
        System.out.println(name.toUpperCase());

        int myAge = 82;
        int yourAge = 59;
        if (myAge > yourAge) {
            System.out.println("i am older");

        } else {
            System.out.println("you are older");
        }
        for (int gi = 0; gi <= 10; gi++){
            System.out.println(gi);

        }
        
        String[] cars = { "an", "bn", "cn", "dn" };
        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        
        }


    }
}
