package com.maitrongnghia.restapi.dao;


import com.maitrongnghia.restapi.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

//    Optional<User> findOneByEmailIgnoreCase(String email);
//
//    Optional<User> findOneByUsername(String login);
//
//    @EntityGraph(attributePaths = "authorities")
//    Optional<User> findOneWithAuthoritiesById(Long id);
//
//    @EntityGraph(attributePaths = "authorities")
//    Optional<User> findOneWithAuthoritiesByUsername(String login);
//
//    Page<User> findAllByUsernameNot(Pageable pageable, String login);
    List<User> findUserByRole(int role);

}
