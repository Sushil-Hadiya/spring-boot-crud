package com.user.crudApp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.user.crudApp.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByName(String name);
}
