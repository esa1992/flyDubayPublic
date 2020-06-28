package services;

import models.Passager;
import services.impl.PassagerServiceImpl;

import java.util.List;

public interface PassagerService {

    PassagerService INSTANSE = new PassagerServiceImpl();

    void savePassager (Passager passager);
    List<Passager> getPassagersList ();

}
