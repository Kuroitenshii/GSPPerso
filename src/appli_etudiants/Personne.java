/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

/**
 *
 * @author nc
 */
public class Personne {
    private Integer id;
    private String nom;
    private String prenom;
    private String courriel;
    private String date_embauche;
    private String rue;
    private String cp;
    private String ville;
    private String role;
    private String position;
    private String date_naissance;
    private Integer telPro;
    private Integer telPerso;

    public Personne(Integer id, String nom, String prenom, String courriel, String date_embauche, String rue, String cp, String ville, String role, String position, String date_naissance, Integer telPro, Integer telPerso) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.courriel = courriel;
        this.date_embauche = date_embauche;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
        this.role = role;
        this.position = position;
        this.date_naissance = date_naissance;
        this.telPro = telPro;
        this.telPerso = telPerso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTelPro() {
        return telPro;
    }

    public void setTelPro(Integer telPro) {
        this.telPro = telPro;
    }

    public Integer getTelPerso() {
        return telPerso;
    }

    public void setTelPerso(Integer telPerso) {
        this.telPerso = telPerso;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getDate_embauche() {
        return date_embauche;
    }

    public void setDate_embauche(String date_embauche) {
        this.date_embauche = date_embauche;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }
}
