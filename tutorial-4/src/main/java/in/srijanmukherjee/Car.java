package in.srijanmukherjee;

public class Car implements Vehicle {
    private Engine engine;

    @Override
    public void run() {
        System.out.println("Vrooom! engine " + engine + " is working");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
