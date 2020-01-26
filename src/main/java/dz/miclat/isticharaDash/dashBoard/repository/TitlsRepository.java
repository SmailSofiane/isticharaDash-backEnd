package dz.miclat.isticharaDash.dashBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dz.miclat.isticharaDash.dashBoard.model.Aviscitoyen;
import dz.miclat.isticharaDash.dashBoard.model.Titre;

@Repository
public interface TitlsRepository extends JpaRepository<Titre,Long> {

}
