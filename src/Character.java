abstract class Character {
    private String name;
    private String weapon;
    private int health;
    private int attack;
    Character(String name, String weapon, int health, int attack){
        this.name = name;
        this.weapon = weapon;
        this.health = health;
        this.attack = attack;
    }
    public boolean isAlive(){
        return health > 0;
    }
    public void takeDamage(int enemyDamage){
        if(health > 0){
            setHealth(health-enemyDamage);
        }else {
            System.out.println("Player is dead");
        }

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }
    public void setAttack(){
        this.attack = attack;
    }
}
