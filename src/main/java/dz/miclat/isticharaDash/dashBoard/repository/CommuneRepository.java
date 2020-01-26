package dz.miclat.isticharaDash.dashBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dz.miclat.isticharaDash.dashBoard.model.Commune;

public interface CommuneRepository   extends JpaRepository<Commune, Long> {

}
