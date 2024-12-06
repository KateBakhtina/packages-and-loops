package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RelaxationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/money.csv")
    public void testCountOfHolidays(int income, int expense, int threshold, int expected) {
        RelaxationService service = new RelaxationService();

        int countOfHoliday = service.relaxCalculation(income, expense, threshold);

        Assertions.assertEquals(countOfHoliday, expected);
    }
}
