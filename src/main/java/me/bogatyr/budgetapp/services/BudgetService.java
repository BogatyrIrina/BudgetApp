package me.bogatyr.budgetapp.services;

public interface BudgetService {
    int getDailyBudget();//Бюджет на день
    int getBalance();//Остаток

    int getVacationBonus(int daysCount);//отпускные за количество дней

    int getSalaryWithVacation(int vacationDaysCount, int vacationWorkingDaysCount, int workingDaysInMonth);
}
