

public class Car {

    private static final String name = null;
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;

    }

    public Car(Engine engine, String name) {
        this.engine = engine;
        
        
        
    }
    
    public Car(){
        this(new Engine(), "Shola");
//        this.getEngine();
    }


    public Engine getEngine() {
        return engine;
    }

    public void methodA(int number) {
        if (number > 100) {
            System.out.println("Too large");
        }


    }

    public void methodB(int number) {
        if (number > 100) {
            System.out.println("Too large");
        }
    }

    public void methodC(int number) {
        if (number > 100) {
            System.out.println("Too large");
        }
    }
}