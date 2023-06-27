package org.example;

import java.util.Date;

public class Adherent {
    private String code;
    private String Nom;
    private String Prenom;
    private Date Date;
    private String Civilite;
    public Adherent(String code, String nom, String prenom, java.util.Date date, String civilite) {
        this.code = code;
        Nom = nom;
        Prenom = prenom;
        Date = date;
        Civilite = civilite;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getCivilite() {
        return Civilite;
    }

    public void setCivilite(String civilite) {
        Civilite = civilite;
    }
}
