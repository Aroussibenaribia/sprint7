package com.aroussi.joueurs.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Joueur {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idJoueur;
    private String nomJ;
    private String prenomJ;
    private String poste;
    private Date releaseDate;
    @ManyToOne
    private Equipe equipe;
    @OneToOne
    private Image image;

    public Joueur() {
        super();
    }

    public Joueur(String nomJ, String prenomJ, String poste, Date releaseDate) {
        super();
        this.nomJ = nomJ;
        this.prenomJ = prenomJ;
        this.poste = poste;
        this.releaseDate = releaseDate;
    }

    public Long getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Long idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getNomJ() {
        return nomJ;
    }

    public void setNomJ(String nomJ) {
        this.nomJ = nomJ;
    }

    public String getArtist() {
        return prenomJ;
    }

    public void setArtist(String prenomJ) {
        this.prenomJ = prenomJ;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Joueurs{" +
                "idJoueur=" + idJoueur +
                ", nomJ='" + nomJ + '\'' +
                ", prenomJ='" + prenomJ + '\'' +
                ", poste='" + poste + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
