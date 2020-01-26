package dz.miclat.isticharaDash.auth.repository;

import org.springframework.stereotype.Repository;

import dz.miclat.isticharaDash.auth.model.DAOUser;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IsticharaDashRepository 
extends JpaRepository<DAOUser,Long> 
{
	DAOUser findByUsername(String username);
	
	
}
