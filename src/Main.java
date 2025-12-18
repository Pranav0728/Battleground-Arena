public class Main {
    public static void main(String[] args) {

        Weapon m416 = new Weapon("M416", 20, 0.8);
        Weapon ump = new Weapon("UMP", 15, 0.9);

        Player1 ply1 = new Player1("Pranav", m416, 100, 2);
        Player2 ply2 = new Player2("Shubham", ump, 100, 1);

        BattleArena arena = new BattleArena();
        arena.battleGround(ply1, ply2);
    }
}
