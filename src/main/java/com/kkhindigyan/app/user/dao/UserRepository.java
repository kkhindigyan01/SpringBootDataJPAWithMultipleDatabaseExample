package com.kkhindigyan.app.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.kkhindigyan.app.user.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
