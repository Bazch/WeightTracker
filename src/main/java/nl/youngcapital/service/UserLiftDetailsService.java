package nl.youngcapital.service;

import nl.youngcapital.domain.UserLiftDetails;
import nl.youngcapital.repository.UserLiftDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserLiftDetailsService {
    @Autowired
    UserLiftDetailsRepository userLiftDetailsRepository;

    public UserLiftDetails save(UserLiftDetails userLiftDetails){
        return userLiftDetailsRepository.save(userLiftDetails);
    }

    public Iterable<UserLiftDetails> findAll(){
        return userLiftDetailsRepository.findAll();
    }

    public Optional<UserLiftDetails> findById(Long id) {
        return userLiftDetailsRepository.findById(id);
    }

    public void delete(Long userLiftDetailsId) {
        userLiftDetailsRepository.deleteById(userLiftDetailsId);
    }
}
