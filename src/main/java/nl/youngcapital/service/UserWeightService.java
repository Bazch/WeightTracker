package nl.youngcapital.service;

import nl.youngcapital.domain.User;
import nl.youngcapital.domain.UserWeight;
import nl.youngcapital.repository.UserRepository;
import nl.youngcapital.repository.UserWeightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class UserWeightService {

    @Autowired
    private UserWeightRepository userWeightRepository;
    @Autowired
    private UserService userService;

    public UserWeight save(UserWeight userWeight){

        return userWeightRepository.save(userWeight);
    }

    public Iterable<UserWeight> findAll(){
        return userWeightRepository.findAll();
    }

    public Optional<UserWeight> findById(Long id) {
        return userWeightRepository.findById(id);
    }


    /*Filling the Database from the backend!
*    @PostConstruct
*    void initWeightTrackerDatabase() {
*        User user;
*        UserWeight userWeight;
*
*        user = userService.save(new User("Bas", "basv_db@hotmail.com"));
*        userWeightRepository.save(new UserWeight(70, user, 20-11-2019));
*        userWeightRepository.save(new UserWeight(80, user, 19-11-2019));
*        userWeightRepository.save(new UserWeight(60, user, 18-11-2019));
*        userWeightRepository.save(new UserWeight(90, user, 17-11-2019));
*        userWeightRepository.save(new UserWeight(100, user, 16-11-2019));
*        userWeightRepository.save(new UserWeight(100, user, 15-11-2019));
*
*    }
*/

}
