package models;

/**
 * Created by s.elistratov on 11/06/2020.
 */
public class Passager {

    private int id;
    private String name;
    private String numberPhone;

    public Passager() {

    }

    public String getName() {
        return name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    private Wallet wallet;

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Passager(String name, String numberPhone, Wallet wallet) {

        this.id = OperationClass.counter++;

        this.name = name;
        this.numberPhone = numberPhone;
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }
}

class Wallet {

    private double Summa;

    public Wallet(double summa) {
        Summa = summa;
    }

    public double getSumma() {
        return Summa;
    }

    public void setSumma(double summa) {
        Summa = summa;
    }
}
