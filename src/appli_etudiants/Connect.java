/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Kuroi-Tenshi
 */
public class Connect {

    private static Connection connect;
    private static String url = "jdbc:mysql://localhost/gsbPerso";
    private static String user = "root";
    private static String mdp = "root";

    //connection a la base de données
    public static Connection getConnect() {
        if (connect == null) { // on test si y'a déja une co, si c'est le cas on la retourn,e sinon on tente d'en créer une
            try {
                connect = (Connection) DriverManager.getConnection(url, user, mdp);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connect;
    }

    public static ResultSet requete(String req) {
        try { //on tente d'executer une requete envoyé depuis une autre page, et on retourne le resultat ou null et l'exception en cas d'erreur
            Statement requete = connect.createStatement();
            ResultSet lignesRetournees = requete.executeQuery(req);
            return lignesRetournees;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void updateInfo(Integer id, String adresse, Integer cp, String ville, String mail, Integer tel1, Integer tel2) {
        //mise a jour des information du client
        try {
            Statement requete = connect.createStatement();
            requete.executeUpdate("UPDATE utilisateurs SET adresse_rue='"+adresse+"', adresse_cp="+cp+", adresse_ville='"+ville+"', mail='"+mail+"', tel_personnel="+tel1+", tel_professionnel="+tel2+" WHERE id_utilisateur="+id);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void updateTitre(Integer id, String titre){
        //mise a jour du titre du cv
        try {
            Statement requete = connect.createStatement();
            requete.executeUpdate("UPDATE cv_titre SET libelle_titre='"+titre+"' WHERE id_utilisateur="+id);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void addXp(Integer id, String date, String titre, DefaultListModel liste){
        //rajoute une experience professionnel a la base
        try {
            Statement requete = connect.createStatement();
            requete.executeUpdate("INSERT INTO cv_experience_prof (id_utilisateur, date_experience_prof, titre_experience_prof) VALUES ("+id+", '"+date+"', '"+titre+"')");
            ResultSet res = requete.executeQuery("select * from cv_experience_prof where titre_experience_prof='"+titre+"' and id_utilisateur = "+id);
            if(res.next()){
            Integer idp = res.getInt("id_experience_prof");
             for(Integer i=0; i < liste.size(); i++){
                //rajoute les activité lié a l'experience
                String donnee = (String) liste.get(i);
                requete.executeUpdate("INSERT INTO cv_activite VALUES ("+idp+", '"+donnee+"')");
            }
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void requete2(String req){
        //fonction permettant d'executer une requete envoyé en paraméttre
        try {
            Statement requete = connect.createStatement();
            requete.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
