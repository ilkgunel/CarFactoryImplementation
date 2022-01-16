package com.ilkaygunel.carfactory.service;

import com.ilkaygunel.carfactory.exception.NotSupportedCarTypeException;
import com.ilkaygunel.carfactory.interfaces.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan("com.ilkaygunel.impl.*")
public class CarService {

    private final BeanFactory beanFactory;

    @Autowired
    public CarService(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public String getCarTypeResult(String carType) throws NotSupportedCarTypeException {
        String result = "";
        carType = carType.substring(0, 1).toUpperCase() + carType.substring(1);
        try {
            Car car = beanFactory.getBean(carType + "CarImpl", Car.class);
            result = car.getType();
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            throw new NotSupportedCarTypeException("This car type not supported " + carType);
        }
        return result;
    }

}
