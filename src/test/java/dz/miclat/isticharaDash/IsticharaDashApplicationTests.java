package dz.miclat.isticharaDash;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import dz.miclat.isticharaDash.dashBoard.controller.MainDashControler;
import dz.miclat.isticharaDash.dashBoard.model.Project;
import dz.miclat.isticharaDash.dashBoard.model.Titre;
import dz.miclat.isticharaDash.dashBoard.model.Wilaya;

@SpringBootTest
class IsticharaDashApplicationTests {
	@Autowired
	MainDashControler contrl;
	

	@Test
	void contextLoads() {
	 List<Project> l=contrl.getProjetsParSecteur("1");
		l.forEach(p->System.out.println(p.getProjetId()+"---"+p.getLibprojet()+"-----"+p.getNbVotants()));
	}

}
