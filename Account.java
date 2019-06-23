import java.util.Scanner;

public class Account{

    String accNum;
    String name;
    double balance;

    Scanner input = new Scanner(System.in);

    void openAccount(){
        System.out.print("Enter account number: ");
        accNum = input.next();
        System.out.print("Enter name: ");
        name = input.next();
        System.out.print("Enter balance: ");
        balance = input.nextDouble();
    }

    void showAccount(){
        System.out.println(accNum + "," + name + "," + balance);
    }

    // this method lets the user deposit money using a scanner
    public void deposit(){
        double amount;
        System.out.println("Enter deposit amount: ");
        amount = input.nextDouble();
        if (amount > 0.00){
            balance = balance + amount;
        }
        else{
            System.err.println("Please enter a valid amount.");
        }
    }
    
    // lets the user withdraw money based on if they withdraw less
    // than their current balance
    public void withdraw(){
        double amount;
        System.out.println("Enter withdraw amount: ");
        amount = input.nextDouble();
        if (amount <= balance){
            balance = balance - amount;
        }
        else{
            System.err.println("Transaction cancelled due to insufficient funds.");
        }
    }

    boolean search(String acn){
        if (accNum.equals(acn)){
            showAccount();
            return true;
        }
        return false;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}