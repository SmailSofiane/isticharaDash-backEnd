package dz.miclat.isticharaDash;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import dz.miclat.isticharaDash.dashBoard.controller.MainDashControler;
import dz.miclat.isticharaDash.dashBoard.model.Titre;
import dz.miclat.isticharaDash.dashBoard.model.Wilaya;

@SpringBootTest
class IsticharaDashApplicationTests {
	@Autowired
	MainDashControler contrl;
	

	@Test
	void contextLoads() {
	 List<Titre> l=contrl.getSecteurParWilaya("01");
		l.forEach(p->System.out.println(p.getNum()+"---"+p.getLibRub()+"-----"+p.getNbVotants()));
		
	}

}
