package dz.miclat.isticharaDash.auth.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import dz.miclat.isticharaDash.auth.model.DAOUser;
import dz.miclat.isticharaDash.auth.repository.IsticharaDashRepository;

@Component
public class JwtUserDetailsService implements UserDetailsService {

	 
     @Autowired 
     private IsticharaDashRepository isticgharaDashDao;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		DAOUser user=isticgharaDashDao.findByUsername(username);
    	
		if(user==null)
		{
			System.err.print("uuuuuuuuser is:"+username+" aaaaand pass is:");
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		else
		{
			System.err.print("uuuuuuuuser   found:"+username.equals(user.getUsername())+"---"+user.getPassword().length());
			
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), 
				user.getPassword(),
				new ArrayList<>());
		
	/*	if ("javainuse".equals(username)) {
			return new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}*/
		//return null;
	}
	


}
