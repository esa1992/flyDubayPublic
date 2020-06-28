package models;

/**
 * Created by s.elistratov on 12/06/2020.
 */
public class Ticket {

    private int id;
    private double price;
    private boolean isActiv;
    private Flyght flyght;
    private boolean isSold;

    public Ticket(double price, boolean isActiv, Flyght flyght, boolean isSold) {

        this.id = OperationClass.counter++;
        this.price = price;
        this.isActiv = isActiv;
        this.flyght = flyght;
        this.isSold = isSold;

    }

    public Ticket() {

    }

    public double getPrice() {
        return price;
    }

    public boolean isActiv() {
        return isActiv;
    }

    public Flyght getFlyght() {
        return flyght;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }
}
