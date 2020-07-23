package kg.myCompany.flyDubay.services;

import kg.myCompany.flyDubay.models.City;
import kg.myCompany.flyDubay.services.impl.CityServiceImpl;

import java.util.List;

public interface CityService {

    CityService INSTANCE = new CityServiceImpl();

    void saveCity(City city);
    List<City> getCityList();

}
