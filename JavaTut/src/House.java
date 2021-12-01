public class House {
    private String color;
    // In the example below we are using the this keyword in the constructor and setter since there
    // is a parameter with the same name. In the getter we don't have and parameters so the this keyword is
    // optional

    /*
    * below is a example using the constructor method wrongly.
    *in this example we have 2 constructors.
    * all 2 constructors initialize variables
    * There is repeated code in both constructors. we are initializing variables in each constructor with some
    * default values.
    * Your should never write constructors like this.
    * Lets look at the right way to do this by using a this() call

    public House() {
        this.color = "sed";
        System.out.println("constructor 1 called");
    }
    public House(String color) {
        this.color = color;
        System.out.println("constructor 2 called");
    } */
    /*
    * right way ->
    * The 1st constructor calls the 2nd, and the 2nd does all the work.
    * No matter what constructor we call, the variables will always be initialized in the 2nd constructor.
    * This is known as constructor chaining, the last constructor has the "responsibility" to initialize the
    * variables.*/

    public House() {
        this("color"); // default value; if an empty constructor is called.
        System.out.println("constructor 1 called");
    }
    public House(String color) {
        this.color = color;
        System.out.println("constructor 2 called");
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
class Shape{
    /*
    * In this example we ahve a class Shape with x,y variables and class Rectangle that extends Shape
    * with variables width and height
    * In Rectangle, the 1st constructor we are calling the 2nd constructor
    * the 2nd constructor calls the parent constructor with parameters x and y
    * The parent constructor will initialize x,y variables while the 2nd Rectangle constructor
    * will initialize the width and height variables
    * Here we have both super() and this() calls
    * */

    private int x;
    private int y;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Shape{
    private int width;
    private int height;

    // 1sy constructor
    public Rectangle(int x, int y){
        this(x,y,0,0); // calls 2nd constructor
    }

    //2nd constructor
    public Rectangle(int x,int y, int width, int height){
        super(x,y); //calls constructor from parent class (Shape)
        this.width = width;
        this.height = height;
    }
}