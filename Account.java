import java.util.Scanner;

public class Account {

   static String accName;
    long accNo ;
     static int balance;


    public Account(String accName,long accNo,int balance){
        this.accName=accName;
        this.accNo=accNo;
        this.balance=balance;
    }


    public static void withdraw(int amount){
        Account acc1=null;
        if(balance>amount){
            System.out.println("enter amount to be withdrawn");}
            
        }
        public static void deposit(int amount){

            System.out.println("enter amount to deposit");

        }
        
    
    public static void main(String[] args) {
        Account acc=null;
        Scanner write = new Scanner(System.in);
        while(true){
        System.out.println("1.create account");
        System.out.println("2.Deposit ");
        System.out.println("3.withdraw");
        System.out.println("4.getDetails");


            System.out.println("enter an option");
        int opt = write.nextInt();
        switch (opt) {
            
    
        case 1://create account
        if(acc==null){
            System.out.println("enter account name");
            Account acc1=new Account(accName, opt, opt);
            acc1.accName =write.nextLine();

        }
        else{
            System.out.println("account already exists");
        }
                
                break;
        case 2://deposit 
        
        break;
        case 3://withdraw
        
        break;
        case 4: //get details
        
        break;
        case 5:
      
        break;

            default:
            System.out.println("you entered the wrong option");
                break;
                
        }
        

        

    
        
        }
        
        
       
        
        
        
        

    }
    

}