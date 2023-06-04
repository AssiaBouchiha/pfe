package ma.sir.obs.bean;


import javax.persistence.*;

@Entity
public class Achat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reference;
    private double montantDevis;
    private String dateAchat;
    private String dateLivraison;
    @ManyToOne
    private Fournisseur fournisseur;
    private double montantAchat;

    public Achat(Long id, String reference, double montantDevis, String dataAchat, String dateLivraison, Fournisseur fournisseur, double montantAchat) {
        this.id = id;
        this.reference = reference;
        this.montantDevis = montantDevis;
        this.dateAchat = dataAchat;
        this.dateLivraison = dateLivraison;
        this.fournisseur = fournisseur;
        this.montantAchat = montantAchat;
    }

    public Achat() {
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getMontantDevis() {
        return montantDevis;
    }

    public void setMontantDevis(double montantDevis) {
        this.montantDevis = montantDevis;
    }

    public String getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(String dateAchat) {
        this.dateAchat = dateAchat;
    }

    public String getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(String dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public double getMontantAchat() {
        return montantAchat;
    }

    public void setMontantAchat(double montantAchat) {
        this.montantAchat = montantAchat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    }
