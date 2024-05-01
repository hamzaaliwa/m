package com.example.gestionsale.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {
    @Id
    private Long id;
    private String nom;
    private int nombresales;
    private String adress;
    @OneToMany(mappedBy = "cinema")
    @JsonIgnore
    private List<Salle> saleList=new ArrayList<>();
}
