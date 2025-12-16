public class BankAccount {
    double balance;
    String holderName;

    BankAccount() {
        balance = 0;
        holderName = "Unknown";
    }

    BankAccount(double balance) {
        this.balance = balance;
        this.holderName = "Unknown";
    }

    BankAccount(double balance, String holderName) {
        this.balance = balance;
        this.holderName = holderName;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ");
    }

    void withdraw(double amount) {
        if (balance >= amount) {
        balance -= amount;
        System.out.println(amount + "Withdrawn. ");
    } else {
        System.out.println("Insufficient funds.");
    }
}
void showInfo() {
    System.out.println("Account Holder: " + holderName);
    System.out.println("Balance: " + balance);
    System.out.println();
}

public static void main(String[] args) {
    BankAccount a1 = new BankAccount();
    BankAccount a2 = new BankAccount(5000);
    BankAccount a3 = new BankAccount(10000, "Sai Krishna");
//    a1.showInfo();
//    a1.deposit(1000);
//
//    a2.withdraw(2000);

    a3.deposit(5000);
    a3.showInfo();
    a3.withdraw(500);


//    a2.showInfo();



    }
}
