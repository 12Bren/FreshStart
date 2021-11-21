public class Car {

    private int doors; // variable for state component of a car AKA characteristics of a car
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validateInput = model.toLowerCase();
        if(validateInput.equals("Porsche") || validateInput.equals("holden")){ //.equals() is a method to test whether a particular value
            // of String is equal to another type of String. It returns true or false.

        }else this.model = "Unknown";

        this.model = model; // placed after to enable the if to work properly
    }

    public String getModel() {
        return this.model;
    }
}
