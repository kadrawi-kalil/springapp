package com.joesalt.tutorial.repository;

import com.joesalt.tutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



import java.util.List;
public interface UserRepository extends JpaRepository<User, Long> {

}
