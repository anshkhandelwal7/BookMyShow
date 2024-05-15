package dev.ansh.BookMyShow.service;

import dev.ansh.BookMyShow.model.Ticket;
import dev.ansh.BookMyShow.model.User;
import dev.ansh.BookMyShow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User login(String email, String password)
    {
        User savedUser=userRepository.findUserByEmail(email);
        if(savedUser==null) {
            throw new UsernameNotFoundException("User not found");
        }
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        if(encoder.matches(password, savedUser.getPassword())) {
            return savedUser;
        }
        throw new UsernameNotFoundException("Wrong password");


    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public User signUp(String name,String email, String password) throws Exception {
        User savedUser=userRepository.findUserByEmail(email);
        if(savedUser!=null)
        {
            throw new Exception("User already exists");
        }
        User user=new User();
        user.setName(name);
        user.setEmail(email);
        BCryptPasswordEncoder Encoder=new BCryptPasswordEncoder();
        user.setPassword(Encoder.encode(password));
        user.setTickets(new ArrayList<Ticket>());
        return userRepository.save(user);

    }
}
