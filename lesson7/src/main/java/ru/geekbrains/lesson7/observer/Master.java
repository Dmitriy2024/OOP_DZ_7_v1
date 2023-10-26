package ru.geekbrains.lesson7.observer;

public class Master implements Observer{

    private String name;
    private int salary = 80000;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, int workingHours) {
        if (this.salary <= salary || workingHours == 1){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; режим работы (1-день, 0-ночь) %s)\n",
                    name, nameCompany, salary, workingHours);
            this.salary = salary;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d; режим работы (1-день, 0-ночь) %s)\n",
                    name, nameCompany, salary, workingHours);
        }
    }
}
