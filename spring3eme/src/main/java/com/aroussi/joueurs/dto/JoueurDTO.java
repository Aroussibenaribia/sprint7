package com.aroussi.joueurs.dto;

import com.aroussi.joueurs.entities.Image;
import com.aroussi.joueurs.entities.Equipe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JoueurDTO {
    private Long idJoueur;
    private String nomJ;
    private String prenomJ;
    private String poste;
    private Date releaseDate;
    private Equipe equipe;
    private Image image;
}
