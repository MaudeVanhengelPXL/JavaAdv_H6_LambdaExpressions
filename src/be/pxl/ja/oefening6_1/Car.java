package be.pxl.ja.oefening6_1;

public class Car {

    private Engine engine;
    private String fuel;

    public Car(String fuel) {
        this.engine = new Engine();
        this.fuel = fuel;
    }
    public class Engine {
        public void start() {
            System.out.println("The engine has started and is using fuel " + fuel);
        }
    }

    public void start() {
        this.engine.start();
    }
}
