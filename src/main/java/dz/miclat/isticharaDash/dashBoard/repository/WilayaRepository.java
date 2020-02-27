package dz.miclat.isticharaDash.dashBoard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import dz.miclat.isticharaDash.dashBoard.model.Wilaya;
@Repository
public interface WilayaRepository extends JpaRepository<Wilaya ,String> {

	@Query(value="select t2.*,isnull(t1.nbVotants,0) as nbVotants\r\n" + 
			"from\r\n" + 
			"( select * from ProjetsNat2.dbo.Wilaya) t2\r\n" + 
			" left join\r\n" + 
			" (\r\n" + 
			"SELECT w.codew,w.libelar,w.libelfr ,count(codew) as nbVotants\r\n" + 
			"  FROM [ProjetsNat2].[dbo].[Aviscitoyen] A\r\n" + 
			"  inner join ProjetsNat2.dbo.Wilaya w\r\n" + 
			"  on\r\n" + 
			"  w.codew=A.CodeWR\r\n" + 
			"  where\r\n" + 
			"  A.codeTitre <> '0'\r\n" + 
			"  group by  w.codew,w.libelar,w.libelfr\r\n" + 
			"  )t1\r\n" + 
			"on\r\n" + 
			"t1.codew=t2.codew",nativeQuery =true)
	List<Wilaya> findAllWilaya();
	
	
	
}
