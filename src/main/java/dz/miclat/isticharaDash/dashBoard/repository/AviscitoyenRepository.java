package dz.miclat.isticharaDash.dashBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dz.miclat.isticharaDash.dashBoard.model.Aviscitoyen;
import dz.miclat.isticharaDash.dashBoard.model.Commune;

public interface AviscitoyenRepository extends JpaRepository<Aviscitoyen, Long> {

}
