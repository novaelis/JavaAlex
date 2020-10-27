package introduction;
import java.util.Date;

public class Account {

    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);

        account.withdraw(account.balance, 2500);
        account.deposit(account.balance, 3000);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " + (account.getAnnualInterestRate()/12));
        System.out.println("The account was created " + account.getDateCreated());
    }

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    public java.util.Date dateCreated;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(int i) {
        id = i;
    }

    public int getID() {
        return id;
    }

    public void setBalance(double b){
        balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double interest) {
        annualInterestRate = interest;
    }

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public static double withdraw(double balance, double withdrawAmount) {
        return balance = - withdrawAmount;
    }

    public static double deposit(double balance, double depositAmount) {
        return balance = + depositAmount;
    }   
}