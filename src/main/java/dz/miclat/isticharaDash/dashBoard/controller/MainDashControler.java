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
import dz.miclat.isticharaDash.dashBoard.model.Wilaya;
import dz.miclat.isticharaDash.dashBoard.repository.AviscitoyenRepository;
import dz.miclat.isticharaDash.dashBoard.repository.TitlsRepository;
import dz.miclat.isticharaDash.dashBoard.repository.WilayaRepository;

@RestController
@CrossOrigin
@RequestMapping("/dash")
public class MainDashControler {

	@Autowired
	private TitlsRepository titlsrepository;

	@Autowired
	AviscitoyenRepository aviscitoyenRepository;

	@Autowired
	WilayaRepository wilayaRepository;

	// @GetMapping("/{titres}", produces = "application/json")
	// @RequestMapping(value="/listtitres",method =RequestMethod.GET )
	// The new approach makes it possible to shorten this simply to
	@GetMapping("/avis")
	public List<Aviscitoyen> getAvis() {
		return null; // wilayaRepository.findAll();//.get(0); //titlsrepository.findAll();
	}

	@GetMapping("/wilayaavis")
	public List<Wilaya> getListCommune() {
		return wilayaRepository.findAll();
	}

}
