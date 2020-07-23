package kg.myCompany.flyDubay.controllers;

import kg.myCompany.flyDubay.models.City;
import kg.myCompany.flyDubay.services.CityService;

public class CityController {

    private CityService cityService = CityService.INSTANCE;

    void saveCity(){

        City city = new City("Osh");
        cityService.saveCity(city);

    }

}
