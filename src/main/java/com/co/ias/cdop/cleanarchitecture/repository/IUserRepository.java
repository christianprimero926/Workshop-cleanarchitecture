package com.co.ias.cdop.cleanarchitecture.repository;

import com.co.ias.cdop.cleanarchitecture.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
