package com.jira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jira.entity.UserEntity;

@Repository
public interface LoginRegisterRepo extends JpaRepository<UserEntity, Long> {

	@Query(value = "select * from user_entity where EMAIL=:email and PASSWORD=:password", nativeQuery = true)
	UserEntity findByEmailAndPassword(@Param("email") String email, @Param("password") String password);

}
