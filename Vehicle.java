public class Vehicle {

    private  String model;

    private String color;
    
    private int wheels;

    private Engine engine;


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public void drive(){
        System.out.println("The car  drives on "+ engine.getFuel()+ " of capacity "+ engine.getCapacity()+ "L");
    }

    public void start(){
        System.out.println("the car has dtarted");
    }



}

