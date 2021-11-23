public class Fish extends Animal {
    private int gills; // characteristics of fish
    private int eyes;
    private int fines;

    public Fish( int weight, String name, int size, int gills, int eyes, int fines) {

        super(1, 1, weight, name, size);
        this.gills = gills;
        this.eyes = eyes;
        this.fines = fines;
    }

    private void rest(){

    }
    private void moveMuscles(){

    }
    private void moveBackFin(){

    }
    private void swim(int swimmingSpeed){//to swim the fish needs to move it's muscles and fins
        moveMuscles();
        moveBackFin();
        super.move(swimmingSpeed);
    }

}
