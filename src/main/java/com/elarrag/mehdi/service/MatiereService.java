package com.elarrag.mehdi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elarrag.mehdi.model.Matiere;
import com.elarrag.mehdi.repository.MatiereRepository;

@Service
public class MatiereService {
	
	@Autowired
	MatiereRepository repository;
	
	public List<Matiere> getAllMatieres() {
		List<Matiere> matieres = repository.findAll();
		return matieres;
	}
	
	public void insertMatiere(Matiere matiere) {
		repository.save(matiere);
	}

}
