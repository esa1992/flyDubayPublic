package kg.myCompany.flyDubay.controllers;

import kg.myCompany.flyDubay.models.Flyght;
import kg.myCompany.flyDubay.services.FlyghtService;

public class FlyghtController {

    private FlyghtService flyghtService = FlyghtService.INSTANCE;

    void saveFlyght(){

        Flyght flyght = new Flyght();
        flyghtService.saveFlyght(flyght);

    }

}
