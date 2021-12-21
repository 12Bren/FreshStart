public class Car extends Vehicle{

    private int doors; // variable for state component of a car AKA characteristics of a car
    private int wheels;
    private String model;
    private boolean moving;
    private int speed;

    public Car(String engine, String color, int doors, int wheels, String model,
               boolean moving, int speed) {
        super(engine, color);
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.moving = moving;
        this.speed = speed;
    }

    private void changingGears(){

    }
    private void steering(){

    }
    private void increaseSpeed(){
    }
    private int decreaseSpeed(){

        return decreaseSpeed();
    }

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
