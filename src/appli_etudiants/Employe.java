/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

/**
 *
 * @author nc
 */
public class Employe extends Personne{
    private String login;
    private String mot_de_passe;

    public Employe(Integer id, String nom, String prenom, String courriel, String date_embauche, String rue, String cp, String ville, String role, String position, String date_naissance, String telPro, String telPerso) {
        super(id, nom, prenom, courriel, date_embauche, rue, cp, ville, role, position, date_naissance, telPro, telPerso);
    }


    
    //accesseurs
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }
     
}
