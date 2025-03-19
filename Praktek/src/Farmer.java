
public class Farmer {

    private String name;
    private String favourite;

    public String getName() {
        return name;
    }

    public String getFavourite() {
        return favourite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavourite(String favourite) {
        this.favourite = favourite;
    }

    public Farmer(String name, String favourite) {
        this.name = name;
        this.favourite = favourite;
    }

    void talk() {
        System.out.println("Hello, my name is " + name + " and my favourite plant is " + favourite);
    }
}
