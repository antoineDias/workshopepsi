package fr.backend.back.request.dto;

import fr.backend.back.categories.Categorie;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class RequestDTOFindAll {

    private Long id;
    private String titre;
    private String corps;
    private List<Categorie> categories;
    private LocalDate date_ecriture;
    private LocalDate date_modif;

}
