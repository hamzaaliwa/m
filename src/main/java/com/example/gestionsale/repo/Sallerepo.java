package com.example.gestionsale.repo;

import com.example.gestionsale.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "films")
public interface Sallerepo extends JpaRepository<Salle,Long> {
}
