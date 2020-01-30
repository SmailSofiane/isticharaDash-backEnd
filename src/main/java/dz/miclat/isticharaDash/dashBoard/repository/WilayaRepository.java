package dz.miclat.isticharaDash.dashBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dz.miclat.isticharaDash.dashBoard.model.Wilaya;
@Repository
public interface WilayaRepository extends JpaRepository<Wilaya ,Long> {

}
