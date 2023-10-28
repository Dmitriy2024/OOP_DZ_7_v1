package ru.geekbrains.lesson7.observer;

public class NightWorker implements  Observer{

    private String name;

    private int salary = 50000;

    private int workingHours = 0; //Работа: днем=1,ночью=0

    public NightWorker(String name) {
        this.name = name;
    }


    @Override
    public void receiveOffer(String nameCompany, int salary, int workingHours) {
        if (this.salary <= salary && workingHours == 0) {
            System.out.printf("NightWorker %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; режим работы (1-день, 0-ночь) %s)\n",
                    name, nameCompany, salary, workingHours);
            this.salary = salary;
        } else {
            System.out.printf("NightWorker %s: Я найду работу получше! (компания: %s; заработная плата: %d; режим работы (1-день, 0-ночь) %s)\n",
                    name, nameCompany, salary, workingHours);
        }
    }
}
