package com.exam.service.imp;

import com.exam.entity.User;
import com.exam.entity.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    // creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User local=this.userRepository.findByUsername(user.getUsername());
        if(local !=null){
            System.out.println("User is already there !!");
            throw new Exception("User already present !!");
        }else{
            //user create
            for (UserRole ur:userRoles){
                roleRepository.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local=this.userRepository.save(user);
        }
        return local;
    }

    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public void deleteUserById(Long id) {
        this.userRepository.deleteById(id);
    }
}
