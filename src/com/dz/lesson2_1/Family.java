package com.dz.lesson2_1;
public class Family {
    private int peopleInTheFamily;
    private String name;
    private Home home;
    private AgeFamily ageFamily;
    public int getPeopleInTheFamily() {
        return peopleInTheFamily;
    }

    public Family(int peopleInTheFamily, String name, Home home, AgeFamily ageFamily) {
        this.peopleInTheFamily = peopleInTheFamily;
        this.name = name;
        this.home = home;
        this.ageFamily = ageFamily;
    }
    public String getName() {
        return name;
    }
    public Home getHome(Home home) {
        return home;
    }

    public Home getHome() {
        return home;
    }

    public AgeFamily getAgeFamily() {
        return ageFamily;
    }

    public String getInfo1() {
        return  " Добро пожаловать в нашу семью: "+ "\nКоличество людей в семье : "+peopleInTheFamily +"\nВаше имя: "+name
                +"\nВаше Адресс: "+home.getAddress()+"\nНазвание вашего дома: "+home.getName() +"\nВаш возрасть: "+ageFamily;
    }
}