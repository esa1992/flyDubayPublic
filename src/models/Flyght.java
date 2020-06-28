package models;

import java.util.Date;
import java.util.List;

/**
 * Created by s.elistratov on 11/06/2020.
 */
public class Flyght {

    private int id;
    private Date outDate;
    private Date inDate;

    public Flyght() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public City getFromCity() {
        return fromCity;
    }

    public void setFromCity(City fromCity) {
        this.fromCity = fromCity;
    }

    public City getToCity() {
        return toCity;
    }

    public void setToCity(City toCity) {
        this.toCity = toCity;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public List<Passager> getPassagers() {
        return passagers;
    }

    public void setPassagers(List<Passager> passagers) {
        this.passagers = passagers;
    }

    private City fromCity;
    private City toCity;
    private Plane plane;
    private List<Passager> passagers;

    public Flyght(Date outDate, Date inDate, City fromCity, City toCity, Plane plane) {
        this.outDate = outDate;
        this.inDate = inDate;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.plane = plane;
    }
}
