package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private Publisher jobAgency;

    private int maxSalary;

    private int workingHours;  //работа день\ночь

//    public Company(String name, Publisher jobAgency, int maxSalary) {
//        this.name = name;
//        this.jobAgency = jobAgency;
//        this.maxSalary = maxSalary;
//    }


    public Company( String name, Publisher jobAgency, int maxSalary, int workingHours) {
//        this.random = random;
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
        this.workingHours = workingHours;
    }



//    public void needEmployee(){
//        int salary = random.nextInt(maxSalary);
//        jobAgency.sendOffer(name, salary);
//    }

    public  void needEmployee(){
        int salary = random.nextInt(maxSalary);
        int workingHours = random.nextInt(2);
        jobAgency.sendOffer(name, salary, workingHours);
    }

}
