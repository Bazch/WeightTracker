package nl.youngcapital.api;

import nl.youngcapital.domain.User;
import nl.youngcapital.domain.UserWeight;
import nl.youngcapital.repository.UserRepository;
import nl.youngcapital.service.JwtUserDetailsService;
import nl.youngcapital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    JwtUserDetailsService jwtUserDetailsService;

    @GetMapping(path = "/api/v1/users")
    public List<User> getUsers() {
        return (List<User>) userService.findAll();
    }


    @GetMapping(path = "/api/v1/users/name/{name}")
    public Iterable<User> findByName(@PathVariable String name) {
        return userService.findByName(name);
    }

    @GetMapping(path = "/api/v1/users/username/{name}")
    public User findByUsername(@PathVariable String name) {
        return userService.findByUsername(name);
    }

    @GetMapping(path = "/api/v1/users/email/{email}")
    public boolean existsByEmail(@PathVariable String email) {
        return userService.existsByEmail(email);
    }

    @GetMapping (path ="/api/v1/users/{id}")
    public ResponseEntity<Optional<User>> apiGetById(
            @PathVariable long id) {
        Optional<User> user = userService.findById(id);
        return new ResponseEntity<>(
                user,
                user.isPresent()
                        ? HttpStatus.OK
                        : HttpStatus.NOT_FOUND);
    }

    @PostMapping (path="/register")
    void addUser(@RequestBody User user) {
         jwtUserDetailsService.save(user);
    }

    @PutMapping(path="/api/v1/users/{id}")		// Update
    public ResponseEntity<User> apiUpdate(
            @PathVariable("/api/v1/users/id") long id,
            @RequestBody User user) {
        if (user == null || user.getId() != id)
            return new ResponseEntity<>(
                    HttpStatus.BAD_REQUEST);

        Optional<User> oldUser = userService.findById(user.getId());
        if (!oldUser.isPresent()) {
            return new ResponseEntity<>(
                    HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(
                userService.save(user),
                HttpStatus.OK);
    }

    @DeleteMapping(path="/api/v1/users/{userId}")
    public void delete(@PathVariable Long userId) {
        userService.delete(userId);
    }

}
