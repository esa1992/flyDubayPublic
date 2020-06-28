package services;

import models.Plane;
import services.impl.PlaneServiceImpl;

import java.util.List;

public interface PlaneService {

    PlaneService INSTANCE = new PlaneServiceImpl();

    void savePlane (Plane plane);
    List<Plane> getPlanesList ();

}
