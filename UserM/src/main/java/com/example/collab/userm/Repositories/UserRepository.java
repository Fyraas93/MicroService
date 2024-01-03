package com.example.collab.userm.Repositories;

import com.example.collab.userm.Entities.UserDtls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDtls,Integer> {

    public boolean existsByEmail(String email);


}
