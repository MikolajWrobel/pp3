public class BankAccount {
    
    private int balance;
    private String accountID;


    public void displayBalance(){
        System.out.println(balance + "PLN");
    }

    public void deposit(int deposit){
        balance += deposit;
    }

    public void withdraw(int withdraw){
        if (withdraw > 500){
            System.out.println("Możesz wypłacić maksymalnie 500PLN");
        }
        if (balance < withdraw){
            System.out.println("Nie masz tyle pieniędzy, stan konta: " + balance + "PLN");
        } else {
        balance -= withdraw;
        }
    }

    public BankAccount(String accountID){
        this.accountID = accountID;
    }
    
    public static void main (String[] args){
        BankAccount b1 = new BankAccount("1234 4321 1234 4321");
        b1.displayBalance();
        b1.deposit(500);
        b1.displayBalance();
        b1.deposit(200);
        b1.displayBalance();
        b1.withdraw(300);
        b1.displayBalance();
        b1.withdraw(500);
        b1.deposit(300);
        b1.displayBalance();
        b1.withdraw(600);
    }
}
