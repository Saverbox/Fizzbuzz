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

    @Test
    void pruefeDurchDreiTeilbareZahl() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        var result = fizzBuzzService.getResultOfNumber(3);
        Assertions.assertEquals("Fizz", result, "Fizz als Resultat erwartet.");
    }

    @Test
    void pruefeDurchFuenfTeilbareZahl() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        var result = fizzBuzzService.getResultOfNumber(5);
        Assertions.assertEquals("Buzz", result, "Buzz als Resultat erwartet.");
    }

    @Test
    void pruefeDurchDreiUndFuenfTeilbareZahl() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        var result = fizzBuzzService.getResultOfNumber(15);
        Assertions.assertEquals("FizzBuzz", result, "Fizz als Resultat erwartet.");
    }

}