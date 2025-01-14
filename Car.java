public class Car {
    private String color;

    private String model;


    public Car(String model){
        this.model = model;
    }


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void drive(){
        System.out.println("The car "+this.model+" is driving.");
    }


    
}
