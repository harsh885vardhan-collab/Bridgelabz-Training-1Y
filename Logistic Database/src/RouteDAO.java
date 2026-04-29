package com.gla;
import com.gla.DBConnection;

import java.sql.*;

class RouteDAO {

    public static void saveDriver(Driver driver) throws Exception {
        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO drivers VALUES (?, ?)"
        );
        ps.setString(1, driver.driverId);
        ps.setString(2, driver.name);
        ps.executeUpdate();
    }

    public static void saveCheckpoint(String driverId, Checkpoint c) throws Exception {
        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO checkpoints VALUES (?, ?, ?, ?, ?, ?, ?)"
        );

        ps.setString(1, c.id);
        ps.setString(2, driverId);
        ps.setString(3, c.getType());
        ps.setString(4, c.location);
        ps.setDouble(5, c.distance);
        ps.setInt(6, c.expected_time);
        ps.setInt(7, c.actual_time);

        ps.executeUpdate();
    }
}
