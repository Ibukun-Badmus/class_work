package AnimalKingdom;

public class Main{
    public static void main(String[] args) {

    Animal animal = new Animal() {
        @Override
        public void move() {
        }
    };

    Animal cat = new Cat();
    Animal dog = new Dog();

//    animal.move();
//    cat.move();
//    dog.move();

    makeAnimalMove(animal);

    makeAnimalMove(cat);

    makeAnimalMove(dog);

    Car car = new Car();
   playWithMovables(car);
    Human human = new Human();
    playWithMovables(human);
}

public static void playWithMovables(Moveable moveable){
        moveable.move();
}

public  static void makeAnimalMove(Animal animal){
    animal.move();
}
}



