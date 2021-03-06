package dz.miclat.isticharaDash.dashBoard.controller;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dz.miclat.isticharaDash.dashBoard.model.Aviscitoyen;
import dz.miclat.isticharaDash.dashBoard.model.Commune;
import dz.miclat.isticharaDash.dashBoard.model.Project;
import dz.miclat.isticharaDash.dashBoard.model.Titre;
import dz.miclat.isticharaDash.dashBoard.model.Wilaya;
import dz.miclat.isticharaDash.dashBoard.repository.AviscitoyenRepository;
import dz.miclat.isticharaDash.dashBoard.repository.ProjetsRepository;
import dz.miclat.isticharaDash.dashBoard.repository.TitreRepository;
import dz.miclat.isticharaDash.dashBoard.repository.WilayaRepository;

@RestController
@CrossOrigin
@RequestMapping("/dash")
public class MainDashControler {

	@Autowired
	private ProjetsRepository titlsrepository;

	@Autowired
	AviscitoyenRepository aviscitoyenRepository;

	@Autowired
	WilayaRepository wilayaRepository;
	@Autowired
	TitreRepository titrepository;
	@Autowired
	ProjetsRepository projetRepository;

	// @GetMapping("/{titres}", produces = "application/json")
	// @RequestMapping(value="/listtitres",method =RequestMethod.GET )
	// The new approach makes it possible to shorten this simply to
	@GetMapping("/avis")
	public List<Aviscitoyen> getAvis() {
		return null; // wilayaRepository.findAll();//.get(0); //titlsrepository.findAll();
	}

	@GetMapping("/wilayaavis")
	public List<Wilaya> getListCommune() {
		
		
		List<Wilaya> listwilaya = wilayaRepository.findAllWilaya();
		// List<Commune> listcom=listwilaya.get(0).getComms();
		// System.err.println(listwilaya.get(0).getCommune().get(0).getLibelleC());
		return listwilaya;
	}

	@GetMapping("/listsecteur")
	public List<Titre> getSecteurParWilaya(@RequestParam String codew) {
		return titrepository.liteSecteurWilaya(codew);
	}

	@GetMapping("listprojetparsect")
	public List<Project> getProjetsParSecteur(@RequestParam String codes)
	{
		return projetRepository.listprojectOfSecteur(codes);
	}
	
}
