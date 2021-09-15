package com.krivis.userservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.krivis.userservice.entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

}
