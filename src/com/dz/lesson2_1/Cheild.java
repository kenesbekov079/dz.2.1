package com.dz.lesson2_1;
public final class Cheild extends  Parents {
    public Cheild(int peopleInTheFamily, String name, Home home, AgeFamily ageFamily) {
        super(peopleInTheFamily, name, home, ageFamily);
    }
    @Override
    public String getInfo1() {
        return super.getInfo1()+ "\nМетод успешно перезаписан: ";
    }
}
