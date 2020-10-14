package jre.maintainme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import jre.maintainme.entities.users.EntityUser;
import jre.maintainme.repositories.EntryUserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired EntryUserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        EntityUser currentUser = repo.findByUsername(username);

        UserDetails user = new User(
            username, 
            currentUser.getPassword(), 
            true, 
            true, 
            true, 
            true,
            AuthorityUtils.createAuthorityList(currentUser.getRole())
        );

        return user;
    }
}
