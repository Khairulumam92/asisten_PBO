
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Plant plant1 = new Flower("Sunflower");
        Plant plant2 = new Fungus("Sun-shroom");
        Plant plant3 = new Flower("Marigold"); // Added a new flower plant
        Plant plant4 = new Fungus("Puff-shroom"); // Added new fungus plant
        Farmer farmer1 = new Farmer("John", plant1.getName());
        Farmer farmer2 = new Farmer("Jane", plant2.getName());

        System.out.println("Hello world!");
        System.out.println("Currentd Date :" + new Date());

        farmer1.talk();
        farmer2.talk();

        ((Flower) plant1).talk();
        ((Fungus) plant2).talk();
        ((Flower) plant3).talk();
        ((Fungus) plant4).talk();
    }
}
