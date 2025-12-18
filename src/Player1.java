public class Player1 extends Character{
    Player1(String name, String weapon, int health, int attack){
        super(name,weapon,health,attack);
    }
    public void takeDamage(int enemyDamage){
        super.takeDamage(enemyDamage);
    }

}
