package com.elarrag.mehdi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elarrag.mehdi.model.Matiere;
import com.elarrag.mehdi.service.MatiereService;

@RestController
public class MatiereController {
	
	@Autowired
	MatiereService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Matiere> getAllMatieres() {
		insertData();
		return service.getAllMatieres();
	}
	
	private void insertData(){
		Matiere m1 = new Matiere(0,"DevOps","Achour");
		Matiere m2 = new Matiere(0,"Métrique dans la qualité","Tigma");
		Matiere m3 = new Matiere(0,"Génie logiciel","Nafil");
		Matiere m4 = new Matiere(0,"Test logicel","Nafil");
		Matiere m5 = new Matiere(0,"JEE","EL hadi");
		Matiere m6 = new Matiere(0,"Projets transversaux","Safae Achour");
		service.insertMatiere(m1);
		service.insertMatiere(m2);
		service.insertMatiere(m3);
		service.insertMatiere(m4);
		service.insertMatiere(m5);
		service.insertMatiere(m6);
	}
	
	

}
