public class Main {
    public static void main(String[] args) {
        Farmer farmer1 = new Farmer();
        Farmer farmer2 = new Farmer();

        Plant plant1 = new Plant();
        Plant plant2 = new Plant();

        farmer1.name = "John";
        farmer2.name = "Jane";

        farmer1.favourite = "Carrot";
        farmer2.favourite = "Tomato";

        farmer1.talk();
        farmer2.talk();
    }
}
