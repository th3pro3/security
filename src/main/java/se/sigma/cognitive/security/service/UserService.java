package se.sigma.cognitive.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import se.sigma.cognitive.security.sharedDto.UserDto;

public interface UserService extends UserDetailsService {

    UserDto createUser(UserDto user);
    UserDto getUser(String email);

    UserDto getUserByUserId(String id);
}
