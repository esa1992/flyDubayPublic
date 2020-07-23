package kg.myCompany.flyDubay.services;

import kg.myCompany.flyDubay.exceptions.WrongDate;
import kg.myCompany.flyDubay.exceptions.WrongParametrs;
import kg.myCompany.flyDubay.exceptions.WrongPlane;
import kg.myCompany.flyDubay.models.Flyght;
import kg.myCompany.flyDubay.services.impl.FlyghtServiceImpl;

import java.util.List;

public interface FlyghtService {

    FlyghtService INSTANCE = new FlyghtServiceImpl();

    void setFlyght(Flyght flyght);

    void saveFlyght(Flyght flyght);
    List<Flyght> getFlyghtList ();

    Flyght createNewFlyght (Flyght flyght) throws WrongParametrs, WrongDate, WrongPlane;

}
