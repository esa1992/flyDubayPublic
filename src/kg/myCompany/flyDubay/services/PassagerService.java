package kg.myCompany.flyDubay.services;

import kg.myCompany.flyDubay.models.Passager;
import kg.myCompany.flyDubay.services.impl.PassagerServiceImpl;

import java.util.List;

public interface PassagerService {

    PassagerService INSTANSE = new PassagerServiceImpl();

    public void setPassager(Passager passager);

    void savePassager (Passager passager);
    List<Passager> getPassagersList ();

}
