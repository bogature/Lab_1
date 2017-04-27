package Run;

/**
 * Created by nout on 24.04.17.
 */
public class Mazda extends ElectricCar {
    public int wheel;
    public int numberOfDoors;
    public String type;
    public Mazda(String name, float speed, float weight, int passengers, int wheel, int numberOfDoors, String type) {
        super(name, speed, weight, passengers);
        this.wheel = wheel;
        this.numberOfDoors = numberOfDoors;
        this.type = type;
    }

    public String toSting()
    {
        return " Назва:" + getName() +  " Швидкість:" + getSpeed() + " Вага:" + getWeight() + " Кількість пасажирів:" +
                getPassenger() +" Кількість коліс:" + getWheel() + " Кількість дверей: " + getNumberOfDoors() +  " Тип:" + getType();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getType() {
        return type;
    }

    @Override
    public int getWheel() {
        return wheel;
    }
}
