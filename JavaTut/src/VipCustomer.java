public class VipCustomer {
    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer(){
        this("default name", "default@gmail.com", 5000);
        //constructor empty should call the constructor with 3 parameters with default values
    }

    public VipCustomer(String name, double creditLimit)
    { this(name, "unknown email", creditLimit );
    }//constructor should pass on the 2 values it receives and ass a default value for the third
    // passing on is just allowing the value to store user to input instead of a default value

    public VipCustomer(String name, String email, double creditLimit){
        this.creditLimit = creditLimit;
        this.email = email;
        this.name = name;
        //constructor should save all fields
        // saving a field is just passing the information to the fields with ne default values
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
