package fr.backend.back.request;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany
    @JoinTable(
            name = "article_categorie",
            joinColumns = @JoinColumn(name = "article_id"),
            inverseJoinColumns = @JoinColumn(name = "categorie_id"))
    private String titre;
    private String corps;
    private LocalDate date_ecriture;
    private LocalDate date_modif;

}
