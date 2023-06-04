package ma.sir.obs.bean;

import javax.persistence.*;

import java.util.List;

@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String reference;
    private String email;


    // constructeurs, getters et setters

    public Fournisseur(Long id, String nom, String prenom, String fournisseurReference, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.reference = fournisseurReference;
        this.email = email;
    }

    public Fournisseur() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
