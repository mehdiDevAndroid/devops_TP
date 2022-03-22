package com.elarrag.mehdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elarrag.mehdi.model.Matiere;

@Repository
public interface MatiereRepository extends JpaRepository<Matiere, Integer>{

}
