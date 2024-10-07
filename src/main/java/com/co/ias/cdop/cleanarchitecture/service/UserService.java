package com.co.ias.cdop.cleanarchitecture.service;

import com.co.ias.cdop.cleanarchitecture.model.User;
import com.co.ias.cdop.cleanarchitecture.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final IUserRepository userRepository;
    public void createUser(User user) {userRepository.save(user);}
    public List<User> getAllUsers() {return userRepository.findAll();}
}
