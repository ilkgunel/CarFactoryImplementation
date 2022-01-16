package com.ilkaygunel.carfactory.impl;

import com.ilkaygunel.carfactory.interfaces.Car;
import org.springframework.stereotype.Service;

@Service("SedanCarImpl")
public class SedanCarImpl implements Car {
    @Override
    public String getType() {
        return "Sedan Car has produced.";
    }
}
