package com.ilkaygunel.carfactory.impl;

import com.ilkaygunel.carfactory.interfaces.Car;
import org.springframework.stereotype.Service;

@Service("HatchbackCarImpl")
public class HatchbackCarImpl implements Car {
    @Override
    public String getType() {
        return "Hatchback Car has produced.";
    }
}
