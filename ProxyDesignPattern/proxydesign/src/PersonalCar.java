/**
 * Created by George.Tantareanu on 10/3/2016.
 */
public class PersonalCar implements Car {
    public String color;
    public Key key;
    public String model;

    public PersonalCar(String color, Key key){
        this.color = color;
        this.key = key;
    }

    @Override
    public void displayInfo() {
        System.out.println("Model " + model + ". Color " + color);
    }

    public Key getKey() {
        return key;
    }

    public void startCar() {
        System.out.println("Start the car");
    }
}
