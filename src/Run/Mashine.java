package Run;

/**
 * Created by nout on 24.04.17.
 */
abstract class Mashine {

    final float MaxSpeed = 120;
    final float MinSpeed = 0;
    final int MinPassenger = 1;
    final int MaxPassenger = 5;

    public String name;
    public float speedNow;
    public Mashine (String name, int speed) { }
    public String getName() {
        return name;
    }

}
