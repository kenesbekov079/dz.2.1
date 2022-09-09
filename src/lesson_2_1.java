import com.dz.lesson2_1.AgeFamily;
import com.dz.lesson2_1.Cheild;
import com.dz.lesson2_1.Home;
import com.dz.lesson2_1.Parents;

public class lesson_2_1 {
    public static void main(String[] args) {
        String[] commands = {"sit down", "lie"};
        Shelter romashka = new Shelter(" Flover ", "Chyi 1");
        Shelter romashka1 = new Shelter(" Tiger ", "Chyi");
        Home home=new Home("Home 1 ","celebrate 1");
        Home home1=new Home("Home 2 ","celebrate 2");
        Home home2=new Home("Home 3 ","celebrate 3");

        Dog dog = new Dog("Charlie", "Alabai", commands, ColorEnum.WHITE, romashka);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Guv Guv");
        Dog dog1 = new Dog("Bagira", "Pitbul",ColorEnum.BLACK, romashka1);
        System.out.println(dog1.getInfo());
        dog1.makeVoice();
        dog1.makeVoice("Grrr Grrr");

        Parents objectA=new Parents(4,"Artur ",home, AgeFamily.TWENTY);
        Cheild objectB=new Cheild(5,"Gerkules",home1,AgeFamily.ELEVEN);
        Cheild objectc=new Cheild(7,"George",home2,AgeFamily.TEN);
        System.out.println(objectA.getInfo1());
        System.out.println(objectB.getInfo1());
        System.out.println(objectc.getInfo1());
    }
}
