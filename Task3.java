import java.util.*;
class BankAccount{
    private double balance;

    public BankAccount(double initialAmount){
        this.balance=initialAmount;
    }

    public double Balance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposite successfull of Rs "+ balance);
        }
        else{
            System.out.println("Invalid Amount For Deposite.");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount; 
            System.out.println("Withdrawal successfull of Rs "+balance);
        }
        else{
            System.out.println("Invalid value enterred For Withdrawal. ");
        }
    }
}
class ATM{
    private  BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account){
        this.account=account;
        this.scanner=new Scanner(System.in);
    }

    public void display(){
        System.out.println("1) Deposit");
        System.out.println("2) Withdraw");
        System.out.println("3) Check Balance");
        System.out.println("4) Exit");
    }

    private void checkBalance(){
        System.out.println("Your Current Balance is : "+ account.Balance());
    }

    private void deposit(){
        System.out.println("Enter The Amount to Deposit : ");
        double amount=scanner.nextDouble();
        account.deposit(amount);
    }

    private void withdraw(){
        System.out.println("Enter The Amount to Withdraw : ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }

    public void run(){
        int choice;
        do{
            display();
            System.out.println("Enter Your Choice : ");
            choice=scanner.nextInt();
            switch(choice){
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                     checkBalance();
                    break;
                case 4:
                    System.out.println("Thank You!!");
                    break;
                default :
                    System.out.println("Invalid Choice. Enter through given Options.");
            }
        } while (choice != 4);
    }
}

 class Task3 {
    public static void main(String args[]){
        System.out.println("Welcome To The ATM!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Four Digit PIN: ");
        int pin =sc.nextInt();
        BankAccount account=new BankAccount(30000.0);
        ATM atm=new ATM(account);
        if(pin == 9359)
{
        atm.run();
}
else{
System.out.println("You Have Enterred a Wrong Pin!!!");
}
    }
}

