/**
 * Created by George.Tantareanu on 10/3/2016.
 */
public class ProxyPersonalCar implements Car {

    private PersonalCar car;

    public ProxyPersonalCar(String color, Key key){
        car = new PersonalCar(color, key);
    }

    @Override
    public void displayInfo() {
        car.displayInfo();
    }
}
