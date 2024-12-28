package SP.ValidateAndError.controller;

import SP.ValidateAndError.dto.UserRequest;
import SP.ValidateAndError.entity.User;
import SP.ValidateAndError.service.UserService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/signup")
    public ResponseEntity<User> saveUser(@RequestBody @Valid  UserRequest userRequest){
        return new ResponseEntity<>(service.saveUser(userRequest), HttpStatus.CREATED);
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<User>> getUser() {
        return ResponseEntity.ok(service.getAllUser());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id) {
        return ResponseEntity.ok(service.getUser(id));
    }
}
