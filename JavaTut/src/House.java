public class House {
    private String color;
    // In the example below we are using the this keyword in the constructor and setter since there
    // is a parameter with the same name. In the getter we don't have and parameters so the this keyword is
    // optional

    public House(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void doors(int numberOfDoors, String typeOfDoor){

    }

    public void setColor(String color) {
        this.color = color;
    }
    //here we have a class House with an instance variable (field) color.
}
