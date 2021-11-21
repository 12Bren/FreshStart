import java.text.DecimalFormat;


public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber; // ALT + INS will generate getters and setters

    DecimalFormat df = new DecimalFormat("#.##");
    DecimalFormat df2 = new DecimalFormat("#");

    public BankAccount(){
        this(12354, 128, " K", "lp@yahoo.com",
                "(301)-556-4589");
    }
    public BankAccount(int accountNumber, double balance, String customerName,
                   String emailAddress, String phoneNumber){
        this.accountNumber = accountNumber; // to avoid possible conflicts when using inharenses don't call setters
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Please add a positive amount.");
        }else {
            double hop =  balance += amount; // read as 150$ + $22 makes perfect sense
            System.out.println("$" + amount + " Was added to your bank account." +
                    " Your current balance is $" + df.format(hop));
        }
    }

    public void withdraw(double withdrawalAmount){

        if (withdrawalAmount > balance){
            System.out.println("Invalid input amount. Your balance is $" + balance +
                    " Your withdrawal amount was $" + df2.format(withdrawalAmount));
        }else {
            double remaining = balance -= withdrawalAmount;
            if (remaining < 0 ){
                System.out.println("Your account is overdrawn by $" + balance);
                balance = 0;
            }
            System.out.println("Hello " + customerName + ", You've withdrawn $" +
                    withdrawalAmount + " from your account. Your remaining balance is $"
                    + df.format(remaining));
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
