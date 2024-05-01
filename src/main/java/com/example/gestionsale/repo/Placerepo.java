package com.example.gestionsale.repo;

import com.example.gestionsale.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "places")
public interface Placerepo extends JpaRepository<Place,Long> {
}
