/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

/**
 *
 * @author Kuroi-Tenshi
 */
public class Responsable extends Personne{
    
    public Responsable(Integer id, String nom, String prenom, String courriel, String date_embauche, String rue, String cp, String ville, String role, String position, String date_naissance, Integer telPro, Integer telPerso) {
        super(id, nom, prenom, courriel, date_embauche, rue, cp, ville, role, position, date_naissance, telPro, telPerso);
    }
    
}
