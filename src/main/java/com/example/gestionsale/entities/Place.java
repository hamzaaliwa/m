package com.example.gestionsale.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Place {
    @Id
    private Long id;
    private String adress;
    private int numero;
    @ManyToOne

    //@JsonIgnore
    private Salle salle;
}
