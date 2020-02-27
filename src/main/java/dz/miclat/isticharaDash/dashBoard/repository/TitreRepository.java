 package dz.miclat.isticharaDash.dashBoard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dz.miclat.isticharaDash.dashBoard.model.Titre;

public interface TitreRepository extends JpaRepository<Titre, Long> {

	
	@Query(value=" select tp.*,isnull(ti.nbVotants,0) as nbVotants from    ProjetsNat2.dbo.Titre tp\r\n" + 
			"    left join \r\n" + 
			"    (\r\n" + 
			"			  SELECT t.num,t.libRub,count(t.num) as nbVotants  \r\n" + 
			"			  FROM [ProjetsNat2].[dbo].[Aviscitoyen] A  \r\n" + 
			"			  inner join ProjetsNat2.dbo.Titre t  \r\n" + 
			"			  on  \r\n" + 
			"			  t.num=A.codeTitre  \r\n" + 
			"			  where  \r\n" + 
			"			  A.codeTitre <> '0'  \r\n" + 
			"			  and\r\n" + 
			"			  CodeWR=?\r\n" + 
			"			  group by  t.num,t.libRub\r\n" + 
			"			  )ti\r\n" + 
			"			  on\r\n" + 
			"			  tp.num=ti.num",nativeQuery = true)
	List<Titre> liteSecteurWilaya(String codeW);
	
}
