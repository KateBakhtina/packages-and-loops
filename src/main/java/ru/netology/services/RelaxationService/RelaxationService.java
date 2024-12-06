package ru.netology.services.RelaxationService;

public class RelaxationService {
    public int relaxCalculation(int income, int expense, int threshold) {
        int counter = 0;
        int check = 0;
        for (int month = 1; month <= 12; month++) {
            if (check >= threshold) {
                counter ++;
                check = (check - expense) / 3;
            }
            else {
                check += income - expense;
            }
        }
        return counter;
    }
}
