
package com.example.student_Management.entities;
import jakarta.persistence.*;
import java.util.Date;
@Entity
public class Student {
    @Id
    @GeneratedValue (strategy= GenerationType. IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    @Temporal (TemporalType.DATE)
    private Date dateNaissance;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int i) {
    }

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}