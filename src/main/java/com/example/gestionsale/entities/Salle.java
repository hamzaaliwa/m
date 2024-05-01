package com.example.gestionsale.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salle {
    @Id
    private Long id;
    private String nom;
    private int nombreplaces;
    @ManyToOne

    //@JsonIgnore
    private Cinema cinema;

    @OneToMany(mappedBy = "salle")
    @JsonIgnore
    private List<Place> placeList = new ArrayList<>();
    @ManyToMany(mappedBy = "salles")
    @JsonIgnore
    private List<Film> filmList = new ArrayList<>();
}

