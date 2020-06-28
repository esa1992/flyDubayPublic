package services;

import models.City;
import services.impl.CityServiceImpl;

import java.util.List;

public interface CityService {

    CityService INSTANCE = new CityServiceImpl();

    void saveCity(City city);
    List<City> getCityList();

}
