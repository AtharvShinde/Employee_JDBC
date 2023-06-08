package com.programming.empapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;
    public static Connection createDBConnetion(){

        try {
            //load driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/employeeDB?useSSL=false";
            String username="root";
            String password="PlanetX@4134";
            con=DriverManager.getConnection(url,username,password);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return con;
    }
}
