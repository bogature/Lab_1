package Run;

/**
 * Created by nout on 24.04.17.
 */
abstract class ElectricCar implements Run {
    public String name;
    public float speed;
    public float weight;
    public int passenger;

    ElectricCar (String name, float speed, float weight, int passenger){
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.passenger = passenger;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public int getPassenger() {
        return passenger;
    }
}
