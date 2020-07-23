package kg.myCompany.flyDubay.services.impl;

import kg.myCompany.flyDubay.enums.FlyghtStatus;
import kg.myCompany.flyDubay.exceptions.WrongDate;
import kg.myCompany.flyDubay.exceptions.WrongParametrs;
import kg.myCompany.flyDubay.exceptions.WrongPlane;
import kg.myCompany.flyDubay.models.Flyght;
import kg.myCompany.flyDubay.services.FlyghtService;

import java.util.List;

public class FlyghtServiceImpl implements FlyghtService {


    @Override
    public void setFlyght(Flyght flyght) {

    }

    @Override
    public void saveFlyght(Flyght flyght) {

    }

    @Override
    public List<Flyght> getFlyghtList() {
        return null;
    }

    @Override
    public Flyght createNewFlyght(Flyght flyght) throws WrongParametrs, WrongDate, WrongPlane {

        if (flyght.getFromCity() == null || flyght.getToCity() == null){
            throw new WrongParametrs("Ошибка! Не заполнены города!");
        }else if (flyght.getInDate() == null || flyght.getOutDate() == null){
            throw new WrongDate("Ошибка! Даты не заполнены");
        }else if (flyght.getPlane() == null){
            throw new WrongPlane("error");
        }

        flyght.setFlyghtStatus(FlyghtStatus.EXPECTED);
        return flyght;
    }
}
