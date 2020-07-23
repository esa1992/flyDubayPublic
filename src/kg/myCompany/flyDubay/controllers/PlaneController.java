package kg.myCompany.flyDubay.controllers;

import kg.myCompany.flyDubay.models.Plane;
import kg.myCompany.flyDubay.services.PlaneService;

public class PlaneController {

    private PlaneService planeService = PlaneService.INSTANCE;

    void savePlane (){
        Plane plane = new Plane("A320", 82);
        planeService.savePlane(plane);
    }
}
