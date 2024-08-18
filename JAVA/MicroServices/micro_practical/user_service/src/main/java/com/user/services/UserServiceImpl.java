package com.user.services;

import com.user.entity.Contact;
import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    List<User> list = List.of(
            new User(123L, "JEET", 989898),
            new User(124L, "JAY", 98121223),
            new User(125L, "TRIVEDI", 98984545)
    );

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
