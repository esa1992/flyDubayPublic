package controllers;

import models.Passager;
import services.PassagerService;

public class PassagerController {

    PassagerService passagerService = PassagerService.INSTANSE;

    void savePassager(){

        Passager passager = new Passager();
        passagerService.savePassager(passager);

    }


}
