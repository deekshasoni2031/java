import java.util.ArrayList;
import java.util.Scanner;

class Transaction{
    String type;
    double amount ;
     Transaction(String type,double amount){
        this.type=type;
        this.amount=amount;
    }
         public String toString() {
        return type + ": Rs. " + amount;
         }
    }


class Account {
    private String Name;
    private int  AccountNumber;
    private double Balance;
    public Account(String Name, int AccountNumber, double Balance) {
        this.Name = Name;
        this.AccountNumber = AccountNumber;
        this.Balance=Balance;
    }

    ArrayList<Transaction> transaction = new ArrayList<>();
    public void deposit(double amount) {
        //transaction.add(new Transaction("Deposit", amount));
        if(amount>0){
        Balance += amount;
        transaction.add(new Transaction("Deposit", amount));
        System.out.println("Deposited sucessfully:");
        }
    }

    public void withdraw(double amount) {
        if(amount>0 && amount<=Balance){
            Balance -= amount;
            transaction.add(new Transaction("Withdrawal", amount));
            System.out.println("Withdrawn sucessfully:");
        }
        else{
            System.out.println("Insufficient balance");
}
}
    public void ViewTransaction(){
        if (transaction.isEmpty()){
            System.out.println("No transaction");
            }
            else{
                for (Transaction t : transaction) {
                    System.out.println(t);
                }
            }
            }
    public void CheckBalance(){
        System.out.println("Your current balance is: Rs. "+Balance);
    }


}

public class BankApp {

     static Scanner sc = new Scanner(System.in);
        static Account account;
        public static void main(String[] args) {
                    System.out.print("Enter account holder name: ");
                   String name = sc.nextLine();
            account= new Account(name, 472670, 0);

         System.out.println("Account created successfully. Account Number: " );
        
        int choice;
         do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. View Transaction\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                     System.out.println("Enter amount to deposit: ");
                     double dp = sc.nextDouble();
                     account.deposit(dp);
                     break;
                case 2:
                     System.out.println("Enter amount to withdraw: ");
                     double wd = sc.nextDouble();
                     account.withdraw(wd);
                     break;
                case 3:
                     account.CheckBalance();
                     break;
                case 4:
                     account.ViewTransaction();
                     break;
                case 5:
                     System.out.println("Thankyou for using the Bank App. ");
                     break;
                default: 
                     System.out.println("Invalid choice.");
            }
        }
        while(choice !=5);
    }
}
