import java.util.*;
class BankAccount{
    double balance;
    String name;
    void deposit(double amount){
        this.balance = balance + amount;
    }
    void withdraw(double amount){
        this.balance = balance - amount;
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount Acc1 = new BankAccount();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        Acc1.name = sc.nextLine();
        System.out.print("Enter balance : ");
        Acc1.balance = sc.nextDouble();
        System.out.println("Press 1. To deposit Ammount");
        System.out.println("Press 2. To Withdraw Ammount");
        System.out.println("Press 3. To view Balance");
        System.out.println("Press 4. Exit");
        int choice;
        double value;
        do{
            System.out.print("Enter your Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit");
                    value = sc.nextDouble();
                    Acc1.deposit(value);
                    break;
            
                case 2:
                    System.out.println("Enter amount to withdraw");
                    value = sc.nextDouble();
                    Acc1.withdraw(value);
                    break;
                    
                case 3:
                    System.out.println("Avaiable Balance is : " + Acc1.balance);
                    break;

                default:
                    break;
            }
        }while(choice!=4);
        sc.close();
    }
}