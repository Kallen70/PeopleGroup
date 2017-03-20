package com.novauc;

import org.h2.tools.Server;

import java.sql.*;

public class Main {

    public static void main(String[] args)throws SQLException {
	// write your code here

        Server.createWebServer().start();

        Connection conn = DriverManager.getConnection("jdbc:h2:./main");
        Statement stmt = conn.createStatement(); // to data base driver
        stmt.execute("CREATE TABLE IF NOT EXISTS players (id IDENTITY, name VARCHAR, is_alive BOOLEAN, score INT, health DOUBLE)");
        stmt.execute("INSERT INTO players VALUES (NULL, 'Alice', true, 0, 100.0)");

        stmt.execute("UPDATE players SET is_alive = FALSE WHERE name = 'Alice'");
        stmt.execute("DELETE FROM players WHERE name = 'Alice'");

        PreparedStatement stmt2 = conn.prepareStatement("INSERT INTO players VALUES (NULL, ?, ?, ?, ?)"); //set value before exicution
        stmt2.setString(1, "David");
        stmt2.setBoolean(2, true);
        stmt2.setInt(3, 0);
        stmt2.setDouble(4, 100.0);
        stmt2.execute();

        PreparedStatement stmt3 = conn.prepareStatement("SELECT * FROM players");// selects from table
        ResultSet results = stmt3.executeQuery();
        while (results.next()) {
            String playerName = results.getString("name");
            double health = results.getDouble("health");
            int score = results.getInt("score");
            System.out.printf("%s %s %s\n", playerName, health, score);
        }

    }
}
