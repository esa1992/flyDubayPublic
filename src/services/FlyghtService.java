package services;

import models.Flyght;
import services.impl.FlyghtServiceImpl;

import java.util.List;

public interface FlyghtService {

    FlyghtService INSTANCE = new FlyghtServiceImpl();

    void saveFlyght(Flyght flyght);
    List<Flyght> getFlyghtList ();

}
