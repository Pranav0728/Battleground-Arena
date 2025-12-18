package jdbc.dao;

import jdbc.model.Player;
import jdbc.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class PlayerDAO {
    public void savePlayer(Player player){
        String sql = "INSERT INTO players(name, health, heals) VALUES (?, ?, ?)";
        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql))
        {
            ps.setString(1, player.getName());
            ps.setInt(2, player.getHealth());
            ps.setInt(3, player.getHeals());

            ps.executeUpdate();
            System.out.println("✅ Player saved");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void getAllPlayers(){
        String sql = "Select * from players";
        try(Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ){
            while (rs.next()){
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getInt("health")
                );
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
