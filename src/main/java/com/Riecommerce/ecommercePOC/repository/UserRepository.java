package com.Riecommerce.ecommercePOC.repository;

import com.Riecommerce.ecommercePOC.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
   public   User findByEmail(String email);

}
