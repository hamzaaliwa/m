package com.example.gestionsale.repo;

import com.example.gestionsale.entities.Cinema;
import com.example.gestionsale.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "films")
public interface Filmrepo extends JpaRepository<Film,Long> {

}

