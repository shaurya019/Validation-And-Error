package SP.ValidateAndError.service;

import SP.ValidateAndError.dto.UserRequest;
import SP.ValidateAndError.entity.User;
import SP.ValidateAndError.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

//    inject the dow class inside this
    @Autowired
    private UserRepository repository;

    public User saveUser(UserRequest userRequest){
        User user = User.build(
                1,
                userRequest.getName(),
                userRequest.getEmail(),
                userRequest.getMobile(),
                userRequest.getGender(),
                userRequest.getAge(),
                userRequest.getNationality()
        );
        return repository.save(user);
    }

    public List<User> getAllUser(){
        return repository.findAll();
    }

    public User getUser(int id){
        return repository.findByUserId(id);
    }
}