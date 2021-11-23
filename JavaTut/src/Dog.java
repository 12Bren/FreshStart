public class Dog extends Animal{
private int eyes;
private int legs;
private int tail;
private int teeth;
private String coat;

    public Dog(int weight, String name, int size, int eyes,int legs,int tail,int teeth,String coat) {
        // initializes base characteristics
        // of the Animal class which can now be added onto in this class for this specific Animal
        super(1, 1, weight, name, size);// super constructor: to call a constructor that is for
        // a class you are extending(inheriting) from
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }// when extending(inheriting) the constructor must call the inherited class

    public void chew(){ // not all animals chew food
        System.out.println("dog.chew() called");
    }

    @Override// to remind you that were overiding a method that is in the superclass (Animal class)
    public void eat() {
        System.out.println("Dog.eat() callsed");
        chew(); //the process of a dog eating food is that it's chewing
        super.eat();//calls the super equivalent of the class. A super.nameoffunction java will
        // automatically look for the called super class i.e. Animal since Dog extends Animal.
        // Then java will find the called function (eat()) within the superclass, Animal.
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        move(1); //instead of calling move via super.move() it's better to just call move() because if you
        // override the move function at a later time for dog it's going to correctly call the move method
        // also when super.functionname is called it will not run the code within the called method only the
        // code within the inherited class  if method overriding was used
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Do.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed); // instead of using the move method within this class
        // (Dog) java instead used the super class Animal
    }
}
