package Run;

/**
 * Created by nout on 24.04.17.
 */
public class BMV extends ElectricCar{
    private int weel;
    private String kindOfCar;

    public BMV(String name, float speed, float weight, int passengers, int weel, String kindOfCar) {
        super(name, speed, weight, passengers);
        this.weel = weel;
        this.kindOfCar = kindOfCar;
    }

    public String getKindOfCar() {
        return kindOfCar;
    }

    public String toSting()
    {
        return " Назва:" + getName() +  " Швидкість:" + getSpeed() + " Вага:" + getWeight() + " Кількість пасажирів:" +
                getPassenger() +" Кількість коліс:" + getWheel() + " Тип:"  + getKindOfCar();
    }

    @Override
    public int getWheel() {
        return weel;
    }
}