package com.lucas.jdbctest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void saveUser(User user){
        userRepository.save(user);
    }

    public User getUserById(Integer id){
        return userRepository.findById(id).get();
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }
}
