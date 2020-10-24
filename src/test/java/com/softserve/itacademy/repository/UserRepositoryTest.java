package com.softserve.itacademy.repository;


import com.softserve.itacademy.model.Role;
import com.softserve.itacademy.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;
    private static Role mentorRole;
    @Test
    void createUser() {
        User user = new User();
        user.setEmail("rty5i@dv.ua");
        user.setFirstName("Valid-Name");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(mentorRole);
        user = userRepository.save(user);
        assertEquals("Valid-Name", user.getFirstName());
    }

    @Test
    void updateUser() {
        User user = new User();
        user.setEmail("rty5i@dv.ua");
        user.setFirstName("Valid-Name");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(mentorRole);
        userRepository.save(user);
        assertEquals("Valid-Name", user.getFirstName());
    }

}
