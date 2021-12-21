public class Account {
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private int accountNumber;
    private int balance;

    protected Account(String name, String surname, String email, String phoneNumber, int accountNumber) {
        this.name = name; this.accountNumber = accountNumber; this.email = email;
        this.phoneNumber = phoneNumber; this.surname = surname;
    }

    protected void deposit(int money){
        balance += money;
        System.out.println("Your new balance is: $"+ balance);
    }
    protected void withdraw(int amount){
        balance -= amount;
        System.out.println("remaining: $"+ balance);
    }

    protected String getName(){return name;}
    protected String getSurname(){return surname;}
    protected String getEmail(){return email;}
    protected String getPhoneNumber(){return phoneNumber;}
    protected int getAccountNumber(){return  accountNumber;}
    protected int getBalance(){return  balance;}
}


