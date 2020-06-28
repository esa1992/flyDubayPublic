package controllers;

import models.Plane;
import services.PlaneService;

public class PlaneController {

    private PlaneService planeService = PlaneService.INSTANCE;

    void savePlane (){
        Plane plane = new Plane("A320", 82);
        planeService.savePlane(plane);
    }
}
