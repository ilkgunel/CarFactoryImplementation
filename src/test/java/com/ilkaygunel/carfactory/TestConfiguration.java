package com.ilkaygunel.carfactory;

import com.ilkaygunel.carfactory.impl.CabrioCarImpl;
import com.ilkaygunel.carfactory.impl.HatchbackCarImpl;
import com.ilkaygunel.carfactory.impl.SedanCarImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean
    public SedanCarImpl SedanCarImpl() {
        return new SedanCarImpl();
    }

    @Bean
    public CabrioCarImpl CabrioCarImpl() {
        return new CabrioCarImpl();
    }

    @Bean
    public HatchbackCarImpl HatchbackCarImpl() {
        return new HatchbackCarImpl();
    }
}
