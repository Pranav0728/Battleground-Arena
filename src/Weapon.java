public class Weapon {
    private String name;
    private int damage;
    private double accuracy;

    public Weapon(String name, int damage, double accuracy) {
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public String getName() {
        return name;
    }

    public boolean hits() {
        return Math.random() < accuracy;
    }

    public int fire() {
        if (Math.random() < 0.15) {
            System.out.println("💥 CRITICAL SHOT!");
            return damage * 2;
        }
        return damage;
    }
}
