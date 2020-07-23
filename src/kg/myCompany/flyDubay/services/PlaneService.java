package kg.myCompany.flyDubay.services;

import kg.myCompany.flyDubay.models.Plane;
import kg.myCompany.flyDubay.services.impl.PlaneServiceImpl;

import java.util.List;

public interface PlaneService {

    PlaneService INSTANCE = new PlaneServiceImpl();

    void savePlane (Plane plane);
    List<Plane> getPlanesList ();

}
