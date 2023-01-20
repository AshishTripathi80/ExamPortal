package com.exam;

import com.exam.entity.Role;
import com.exam.entity.User;
import com.exam.entity.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamServerApplication  implements CommandLineRunner {

    @Autowired
    private UserService userService;
    public static void main(String[] args) {
        SpringApplication.run(ExamServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting code");
        /*User user =new User();
        user.setFirstName("Ashish");
        user.setLastName("Tripathi");
        user.setPassword("Ashish@12");
        user.setEmail("a@gmail.com");
        user.setUsername("Ashish80");
        user.setProfile("default.png");

        Role role=new Role();
        role.setRoleId(44L);
        role.setRoleName("Admin");

        Set<UserRole> userRoleSet=new HashSet<>();
        UserRole userRole=new UserRole();

        userRole.setRole(role);
        userRole.setUser(user);

        userRoleSet.add(userRole);

        User user1=this.userService.createUser(user,userRoleSet);
        System.out.println(user1.getUsername());
*/

    }
}

