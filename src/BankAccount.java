import java.text.DecimalFormat;


public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    DecimalFormat df = new DecimalFormat("#.##");

    public void deposit(double amount){
        double newBalance = balance + amount;
        if(amount < 0){
            System.out.println("Please add a positive amount.");
        }else
            System.out.println("$" +amount+ " Was added to your bank account." +
                     " Your current balance is $"+ df.format(newBalance));
    }
    public void withdraw(double withdrawalAmount){
        double remainingBalance = withdrawalAmount - balance;

        if (withdrawalAmount > balance){
            System.out.println("Invalid input amount. Your balance is $" + balance);
        }else {
//            if (remainingBalance < 0 ){
//                remainingBalance = 0;
//            }
            System.out.println("Hello " + customerName + ", You've withdrawn $" +
                    withdrawalAmount + " from your account. Your remaining balance is $"
                    + df.format(remainingBalance));
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
