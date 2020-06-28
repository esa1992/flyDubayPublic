package controllers;

import models.City;
import models.Plane;
import services.CityService;

public class CityController {

    private CityService cityService = CityService.INSTANCE;

    void saveCity(){

        City city = new City("Osh");
        cityService.saveCity(city);

    }

}
