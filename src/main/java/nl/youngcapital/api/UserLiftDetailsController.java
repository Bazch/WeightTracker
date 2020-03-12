package nl.youngcapital.api;

import nl.youngcapital.domain.UserLiftDetails;
import nl.youngcapital.service.UserLiftDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping (path = "/api/v1/liftdetails")
public class UserLiftDetailsController {

    @Autowired
    UserLiftDetailsService userLiftDetailsService;

    @GetMapping
    public ResponseEntity<Iterable<UserLiftDetails>> apiGetAll() {
        return new ResponseEntity<Iterable<UserLiftDetails>>(
                userLiftDetailsService.findAll(),
                HttpStatus.OK);
    }

    @PostMapping
    void addUserLiftDetails(@RequestBody UserLiftDetails u) {
        UserLiftDetails userLiftDetails = new UserLiftDetails(u.getValue(), u.getDate(), u.getReps(), u.getUserLift());
        userLiftDetailsService.save(userLiftDetails);
    }

    @DeleteMapping(path = "{userLiftDetailsId}")
    public void delete(@PathVariable Long userLiftDetailsId) {
        userLiftDetailsService.delete(userLiftDetailsId);
    }
}
