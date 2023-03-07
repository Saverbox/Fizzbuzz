package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzServiceTest {

    @Test
    void pruefeNormaleZahl() {
        String result;
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        result = fizzBuzzService.getResultOfNumber(2);
        Assertions.assertEquals("2",result, "Normale Zahl als Resultat erwartet");
    }
    
}