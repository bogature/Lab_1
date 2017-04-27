import Run.BMV;
import Run.Mazda;

public class Main {
    public static void main(String[] args) {

        Mazda A = new Mazda("Mashin1", 100, 2500, 2, 4, 8, "Bronia-12");
        BMV B = new BMV("Mashin2", 120, 1000, 5, 4, "Pasagir");
        System.out.println(A.toSting() + "\n");
        System.out.println(B.toSting());

    }
}
