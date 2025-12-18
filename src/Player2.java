public class Player2 extends Character{
    Player2(String name, String weapon, int health, int attack){
        super(name, weapon, health,attack);
    }
    public void takeDamage(int enemyDamage){
        super.takeDamage(enemyDamage);
    }
}
