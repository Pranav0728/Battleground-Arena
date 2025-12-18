import jdbc.dao.PlayerDAO;
import jdbc.model.Player;

public class Main {

    public static void main(String[] args) {

        // DAO
        PlayerDAO dao = new PlayerDAO();

        // Weapons
        Weapon m416 = new Weapon("M416", 20, 0.8);
        Weapon ump = new Weapon("UMP", 15, 0.9);

        // Game players
        Player1 ply1 = new Player1("Pranav", m416, 100, 2);
        Player2 ply2 = new Player2("Shubham", ump, 100, 1);

        // Battle
        BattleArena arena = new BattleArena();
        arena.battleGround(ply1, ply2);

        // 🔽 Save players to DB
        Player dbPlayer1 = new Player(
                ply1.getName(),
                ply1.getHealth(),
                ply1.getHeals()
        );

        Player dbPlayer2 = new Player(
                ply2.getName(),
                ply2.getHealth(),
                ply2.getHeals()
        );

        dao.savePlayer(dbPlayer1);
        dao.savePlayer(dbPlayer2);

    }
}
