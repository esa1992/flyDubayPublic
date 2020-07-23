package kg.myCompany.flyDubay.controllers;

import kg.myCompany.flyDubay.models.Passager;
import kg.myCompany.flyDubay.services.PassagerService;

public class PassagerController {

    PassagerService passagerService = PassagerService.INSTANSE;

    void savePassager(){

        Passager passager = new Passager();
        passagerService.savePassager(passager);

    }


}
