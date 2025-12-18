public abstract class Character {

    protected String name;
    protected int health;
    protected Weapon weapon;
    protected int heals;

    public Character(String name, Weapon weapon, int health, int heals) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
        this.heals = heals;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attack(Character enemy) {
        if (!weapon.hits()) {
            System.out.println("❌ " + name + " missed the shot!");
            return;
        }

        int damage = weapon.fire();
        System.out.println("🔫 " + name + " fires " + weapon.getName()
                + " dealing " + damage + " damage");
        enemy.takeDamage(damage);
    }

    public void heal() {
        if (heals > 0) {
            health += 25;
            heals--;
            System.out.println("🧪 " + name + " healed (+25 HP) | Heals left: " + heals);
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getHeals() {
        return heals;
    }
}
