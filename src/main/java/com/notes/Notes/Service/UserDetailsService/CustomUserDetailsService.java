package com.notes.Notes.Service.UserDetailsService;

import com.notes.Notes.Entities.UserPrincipal;
import com.notes.Notes.Entities.UsersEntity;
import com.notes.Notes.Repositories.UsersRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UsersRepository usersRepository;

    public CustomUserDetailsService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsersEntity user = usersRepository.findByUsername(username);
        if (user == null) {
            System.out.printf("User not found with username : %s", username);
            throw new UsernameNotFoundException("User not found with username : " + username);
        } else {
            return new UserPrincipal(user);
        }
    }
}
