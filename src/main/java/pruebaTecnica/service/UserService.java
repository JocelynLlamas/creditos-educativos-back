package pruebaTecnica.service;

import java.util.Optional;
import java.util.List;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pruebaTecnica.auth.AuthResponse;
import pruebaTecnica.auth.LoginRequest;
import pruebaTecnica.auth.RegisterRequest;
import pruebaTecnica.entities.User;
import pruebaTecnica.repository.UserRepository;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    //CRUD METHODS
    public User getUserById(Long id){
        Optional<User> optionalUser = userRepository.findAllById(id);
        return optionalUser.get();
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    // DELETE
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
