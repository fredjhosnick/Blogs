package com.gmail.fred;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public CustomUser findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Transactional
    public boolean addUser(String login, String passHash, UserRole role, String email,
                           String phone, String comment) {
        if (userRepository.existsByLogin(login))
            return false;

        CustomUser user = new CustomUser(login, passHash, role, email, phone, comment);
        userRepository.save(user);

        return true;
    }

    @Transactional
    public void updateUser(String login, String email, String phone, String comment) {
        CustomUser user = userRepository.findByLogin(login);

        user.setEmail(email);
        user.setPhone(phone);
        user.setComment(comment);

        userRepository.save(user);
    }
}
