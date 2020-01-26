package dz.miclat.isticharaDash.dashBoard.controller;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dz.miclat.isticharaDash.dashBoard.model.Aviscitoyen;
import dz.miclat.isticharaDash.dashBoard.model.Commune;
import dz.miclat.isticharaDash.dashBoard.model.Titre;
import dz.miclat.isticharaDash.dashBoard.repository.AviscitoyenRepository;
import dz.miclat.isticharaDash.dashBoard.repository.TitlsRepository;
@RestController
@CrossOrigin
@RequestMapping("/dash")
public class MainDashControler {
	
	@Autowired
	private TitlsRepository titlsrepository;
	
	@Autowired 
	AviscitoyenRepository aviscitoyenRepository; 
	//@GetMapping("/{titres}", produces = "application/json")
	//@RequestMapping(value="/listtitres",method =RequestMethod.GET )
	//The new approach makes it possible to shorten this simply to
@GetMapping("/avis")
	public List<Aviscitoyen> getAvis()
	{
		return aviscitoyenRepository.findAll();//.get(0); //titlsrepository.findAll();
	}
	/*@GetMapping("/avis")
	public List<Commune> getListCommune()
	{		
		return aviscitoyenRepository.findAll();
	}*/
	
	
}
