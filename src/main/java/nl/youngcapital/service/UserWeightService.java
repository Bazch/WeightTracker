package nl.youngcapital.service;

import nl.youngcapital.domain.User;
import nl.youngcapital.domain.UserWeight;
import nl.youngcapital.repository.UserWeightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserWeightService {

    @Autowired
    private UserWeightRepository userWeightRepository;

    public UserWeight save(UserWeight userWeight){

        return userWeightRepository.save(userWeight);
    }

    public Iterable<UserWeight> findAll(){
        return userWeightRepository.findAll();
    }

    public Optional<UserWeight> findById(Long id) {
        return userWeightRepository.findById(id);
    }
}
