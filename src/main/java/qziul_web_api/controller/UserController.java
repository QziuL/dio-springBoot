package qziul_web_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qziul_web_api.model.User;
import qziul_web_api.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")       // definindo um prefixo comum nas rotas
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{username}")
    public User getOne(@PathVariable("username") String username) {
        return userRepository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody User user){
        userRepository.save(user);
    }

    @PutMapping()
    public void updateUser(@RequestBody User user){
        userRepository.save(user);
    }
}
