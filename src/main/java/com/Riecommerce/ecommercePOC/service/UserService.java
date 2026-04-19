package com.Riecommerce.ecommercePOC.service;


import com.Riecommerce.ecommercePOC.exception.UserException;
import com.Riecommerce.ecommercePOC.model.User;

public interface UserService {
 public User findUserById(Long userId) throws UserException;
 public User findUserProfileByJwt(String jwt) throws UserException;
}
