package ru.geekbrains.lesson7.observer;

public class Student implements Observer{

    private String name;
    private int salary = 2000;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, int workingHours) {
        if ((this.salary <= salary) && (workingHours == 1)){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d, режим работы (1-день, 0-ночь))\n",
                    name, nameCompany, salary, workingHours);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d, режим работы (1-день, 0-ночь))\n",
                    name, nameCompany, salary, workingHours);
        }
    }
}
