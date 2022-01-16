package com.ilkaygunel.carfactory;

import com.ilkaygunel.carfactory.exception.NotSupportedCarTypeException;
import com.ilkaygunel.carfactory.service.CarService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestConfiguration.class})
public class CarServiceTest {

    @InjectMocks
    CarService carService;

    @Autowired
    private BeanFactory beanFactory;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        ReflectionTestUtils.setField(carService, "beanFactory", beanFactory);
    }

    @Test
    public void cabrioCarTest() throws NotSupportedCarTypeException {
        String result = carService.getCarTypeResult("cabrio");
        assertEquals("Cabrio Car has produced.", result);
    }

    @Test
    public void sedanCarTest() throws NotSupportedCarTypeException {
        String result = carService.getCarTypeResult("sedan");
        assertEquals("Sedan Car has produced.", result);
    }

    @Test
    public void hatchbackCarTest() throws NotSupportedCarTypeException {
        String result = carService.getCarTypeResult("hatchback");
        assertEquals("Hatchback Car has produced.", result);
    }

    @Test
    public void notDefinedCarTest() throws NotSupportedCarTypeException {
        try {
            String result = carService.getCarTypeResult("notdefined"); //This parameter can be anything except cabrio, sedan and hatchback
        } catch (NotSupportedCarTypeException notSupportedCarTypeException) {
            assertEquals("This car type not supported Notdefined", notSupportedCarTypeException.getMessage());
        }

    }
}
