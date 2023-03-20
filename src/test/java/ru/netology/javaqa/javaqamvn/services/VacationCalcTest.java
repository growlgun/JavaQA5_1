package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class VacationCalcTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacationData.csv")
    void shouldReturnMonths(int income, int expenses, int threshold, int expected) {
        VacationCalc service = new VacationCalc();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);


    }

//    @Test
//    void shouldReturn2() {
//        VacationCalc service = new VacationCalc();
//
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//        int expected = 2;
//
//        int actual = service.calculate(income, expenses, threshold);
//        Assertions.assertEquals(expected, actual);
//
//
//    }
}
