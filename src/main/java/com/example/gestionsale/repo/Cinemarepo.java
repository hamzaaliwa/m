package com.example.gestionsale.repo;

import com.example.gestionsale.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cinemas")
public interface Cinemarepo extends JpaRepository<Cinema,Long> {

}
