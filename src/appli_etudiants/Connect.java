/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kuroi-Tenshi
 */
public class Connect {
    private static Connection connect;
    private static String url = "jdbc:mysql/localhost/gsbPerso";
    private static String user = "root";
    private static String mdp = "root";
    
    public static Connection getConnect(){
        if(connect == null){
            try{
                connect = (Connection) DriverManager.getConnection(url,user,mdp);
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        return connect;
    }
}
