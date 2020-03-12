package nl.youngcapital.api;

import nl.youngcapital.domain.User;
import nl.youngcapital.domain.UserLift;
import nl.youngcapital.service.UserLiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping (path = "/api/v1/lifts")
public class UserLiftController {

    @Autowired
    UserLiftService userLiftService;

    @GetMapping
    public ResponseEntity<Iterable<UserLift>> apiGetAll() {
        return new ResponseEntity<Iterable<UserLift>>(
                userLiftService.findAll(),
                HttpStatus.OK);
    }

    @GetMapping(path = "findbyuser")
    public ResponseEntity<Iterable<UserLift>> findByUser(@RequestBody User user) {
        return new ResponseEntity<Iterable<UserLift>>(
                userLiftService.findByUser(user),
                HttpStatus.OK);
    }

    @PostMapping
    void addUserLift(@RequestBody UserLift u) {
        UserLift userLift = new UserLift(u.getTitle(), u.getUser());
        userLiftService.save(userLift);
    }

    @DeleteMapping(path = "{userLiftId}")
    public void delete(@PathVariable Long userLiftId) {
        userLiftService.delete(userLiftId);
    }

}
