package com.ilkaygunel.carfactory.impl;

import com.ilkaygunel.carfactory.interfaces.Car;
import org.springframework.stereotype.Service;

@Service("CabrioCarImpl")
public class CabrioCarImpl implements Car {
    @Override
    public String getType() {
        return "Cabrio Car has produced.";
    }
}
