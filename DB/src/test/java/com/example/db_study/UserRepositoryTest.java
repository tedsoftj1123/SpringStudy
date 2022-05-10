package com.example.db_study;

import com.example.db_study.model.User;
import com.example.db_study.model.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

@Slf4j
public class UserRepositoryTest extends DbStudyApplicationTests{

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        User user =
                User.builder()
                        .account("Test User 03")
                        .email("testuser03@google.com")
                        .phoneNumber("010-1234-5678")
                        .createdAt(LocalDateTime.now())
                        .createdBy("admin")
                        .build();

        User newUser = userRepository.save(user);
        log.info(newUser.toString());
    }
    @Test
    public void read(){
        Optional<User> user =userRepository.findById(1L);

        user.ifPresent(selectUser -> {
            log.info(selectUser.toString());
        });
    }
}
