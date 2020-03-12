package nl.youngcapital.service;

import nl.youngcapital.domain.User;
import nl.youngcapital.domain.UserLift;
import nl.youngcapital.repository.UserLiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserLiftService {

    @Autowired
    UserLiftRepository userLiftRepository;

    public UserLift save(UserLift userLift) {
        return userLiftRepository.save(userLift);
    }

    public Iterable<UserLift> findAll() {
        return userLiftRepository.findAll();
    }

    public Optional<UserLift> findById(Long id) {
        return userLiftRepository.findById(id);
    }

    public void delete(Long userLiftId) {
        userLiftRepository.deleteById(userLiftId);
    }

    public Iterable<UserLift> findByUser(User user){
        return  userLiftRepository.findByUser(user);
    }

}
