package jdbc.model;

public class Player {
    private int id;
    private String name;
    private int health;
    private int heals;

    public Player(String name, int health, int heals) {
        this.name = name;
        this.health = health;
        this.heals = heals;
    }

    public int getHeals() {
        return heals;
    }

    public void setHeals(int heals) {
        this.heals = heals;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
