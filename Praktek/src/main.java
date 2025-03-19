
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Plant plant1 = new Plant("Rose");
        Plant plant2 = new Plant("Sunflower");
        Farmer farmer1 = new Farmer("John", plant1.getName());
        Farmer farmer2 = new Farmer("Jane", plant2.getName());

        System.out.println("Hello world!");
        System.out.println("Currentd Date :" + new Date());

        farmer1.talk();
        farmer2.talk();
    }
}
