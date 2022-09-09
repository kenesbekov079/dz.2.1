package com.dz.lesson2_1;

public class Parents extends Family{
    public Parents(int peopleInTheFamily, String name, Home home, AgeFamily ageFamily) {
        super(peopleInTheFamily, name, home, ageFamily);
    }

    public void paranets(String name, int peopleInTheFamily) {
        super.getName();
        super.getPeopleInTheFamily();
    }

    public void paranets(String name){
        super.getName();
    }
    public final void paranets(String name,int peopleInTheFamily,Home home){
        super.getName();
        super.getPeopleInTheFamily();
        super.getHome(home);
    }
}
