package AnimalKingdom;

public class Human implements Moveable{
    private int everyThingHumanHas;

    public void everyThingThatHumanDoes() {
        System.out.println("Like a human");
    }

    @Override
    public void move(){
        System.out.println("Suck fuel first");
    }
}


