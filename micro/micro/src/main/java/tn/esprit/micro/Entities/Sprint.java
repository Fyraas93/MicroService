package tn.esprit.micro.Entities;


import jakarta.persistence.*;

@Entity
//@Table(name = "sprints")
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String objectifs;
    private int dureeEnJours;

    // Constructeur par défaut
    public Sprint() {
    }

    // Constructeur avec tous les champs sauf l'ID (généralement utilisé lors de la création)
    public Sprint(String nom, String objectifs, int dureeEnJours) {
        this.nom = nom;
        this.objectifs = objectifs;
        this.dureeEnJours = dureeEnJours;
    }

    // Getters et Setters pour tous les champs
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

    public String getObjectifs() {
        return objectifs;
    }

    public void setObjectifs(String objectifs) {
        this.objectifs = objectifs;
    }

    public int getDureeEnJours() {
        return dureeEnJours;
    }

    public void setDureeEnJours(int dureeEnJours) {
        this.dureeEnJours = dureeEnJours;
    }

    // Autres getters et setters pour d'autres champs si nécessaire

    // Méthode supplémentaire pour illustrer la logique métier
    public void incrementerDuree(int jours) {
        this.dureeEnJours += jours;
    }
}
