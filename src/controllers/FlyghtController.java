package controllers;

import models.Flyght;
import services.FlyghtService;

public class FlyghtController {

    private FlyghtService flyghtService = FlyghtService.INSTANCE;

    void saveFlyght(){

        Flyght flyght = new Flyght();
        flyghtService.saveFlyght(flyght);

    }

}
