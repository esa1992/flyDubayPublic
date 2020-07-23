package kg.myCompany.flyDubay.models;

/**
 * Created by s.elistratov on 11/06/2020.
 */
public class    City {

    private int id;
    private String name;

    public City(String name) {
        this.id = OperationClass.counter++;
        this.name = name;

        /*лродрд*/
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
