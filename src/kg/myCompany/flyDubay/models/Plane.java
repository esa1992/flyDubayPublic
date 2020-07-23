package kg.myCompany.flyDubay.models;

/**
 * Created by s.elistratov on 11/06/2020.
 */
public class Plane {

    private int id;
    private String name;
    private int capasity;

    public Plane(String name, int capasity) {

        this.id = OperationClass.counter++;
        this.name = name;
        this.capasity = capasity;
    }
}
