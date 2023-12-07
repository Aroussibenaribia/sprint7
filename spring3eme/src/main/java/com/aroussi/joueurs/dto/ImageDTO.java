package com.aroussi.joueurs.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageDTO {
    private Long idImage ;
    private String name ;
    private String type ;
    private byte[] image;
    private JoueurDTO joueur;
}
