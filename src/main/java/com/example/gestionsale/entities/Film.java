package com.example.gestionsale.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Film {
    @Id
    private Long id;
    private String titre;
    private double durée;
    private Date datesortie;
    @ManyToMany
    @JsonIgnore
    private List<Salle> salles = new ArrayList<>();
}
