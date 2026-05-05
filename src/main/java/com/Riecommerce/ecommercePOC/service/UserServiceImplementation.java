package com.Riecommerce.ecommercePOC.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Optional;

import com.Riecommerce.ecommercePOC.config.JwtProvider;
import com.Riecommerce.ecommercePOC.exception.UserException;
import com.Riecommerce.ecommercePOC.model.User;
import com.Riecommerce.ecommercePOC.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {
    private UserRepository userRepository;
    private JwtProvider jwtProvider;

    public UserServiceImplementation(UserRepository userRepository,JwtProvider jwtProvider) {
        this.userRepository=userRepository;
        this.jwtProvider=jwtProvider;

    }
    @Override
    public User findUserById(Long userId) throws UserException{

        Optional<User>user=userRepository.findById(userId);
        if(user.isPresent()) {
            return user.get();
        }

        throw new UserException("user not found with id:"+userId);

    }
    @Override
    public User findUserProfileByJwt(String jwt)throws UserException {

        String email=jwtProvider.getEmailFromToken(jwt);
        User user=userRepository.findByEmail(email);
        if(user==null) {
            throw new UserException("user not found with email"+email);

        }
        return user;
    }

}
