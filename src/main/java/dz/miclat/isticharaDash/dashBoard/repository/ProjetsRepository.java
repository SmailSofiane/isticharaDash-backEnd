package dz.miclat.isticharaDash.dashBoard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dz.miclat.isticharaDash.dashBoard.model.Aviscitoyen;
import dz.miclat.isticharaDash.dashBoard.model.Project;
import dz.miclat.isticharaDash.dashBoard.model.Titre;

@Repository
public interface ProjetsRepository extends JpaRepository<Project,Long> {

	@Query(value="select tp.*,isnull(ti.nbVotants,0) as nbVotants\r\n" + 
			"    from  ProjetsNat2.dbo.listprojetsCom tp  \r\n" + 
			"	left join   \r\n" + 
			"	(  \r\n" + 
			"						  SELECT t.codeArticl,t.codeprojet,count(t.codeArticl) as nbVotants    \r\n" + 
			"						  FROM [ProjetsNat2].[dbo].[Aviscitoyen] A    \r\n" + 
			"						  inner join ProjetsNat2.dbo.listprojetsCom t    \r\n" + 
			"						  on    \r\n" + 
			"						  t.codeArticl=A.codeTitreCom    \r\n" + 
			"						  and\r\n" + 
			"						  t.codeprojet=A.codeprojetCom\r\n" + 
			"						  where   \r\n" + 
			"						    \r\n" + 
			"						  A.codeprojetCom <> '0'    \r\n" + 
			"		    			  group by  t.codeArticl,t.codeprojet \r\n" + 
			"	 )ti  \r\n" + 
			"						  \r\n" + 
			"		on  \r\n" + 
			"		tp.codeArticl=ti.codeArticl\r\n" + 
			"		and\r\n" + 
			"		tp.codeprojet=ti.codeprojet\r\n" + 
			"		where\r\n" + 
			"	    tp.codeArticl=?  ",nativeQuery = true)
	public List<Project> listprojectOfSecteur(String codeSecteur);
}
