
public class Main{
    public static void main(String args[]){
        Player1 ply1 = new Player1("Pranav","M416",100,40);
        Player2 ply2 = new Player2("Shubham","UMP",100,10);
        BattleArena arena = new BattleArena();
        arena.battleGround(ply1,ply2);

    }
}