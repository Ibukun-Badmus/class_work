package AnimalKingdom;

public class Car implements Moveable {
    private int everyThingThatCarHas;

    public void veryThingThatCarDoes(){
        System.out.println("Like a car");
    }

    @Override
    public void move() {
        System.out.println("move like a car");
    }
}
