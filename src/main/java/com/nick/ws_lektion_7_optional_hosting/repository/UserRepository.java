package com.nick.ws_lektion_7_optional_hosting.repository;

import com.nick.ws_lektion_7_optional_hosting.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {



}
