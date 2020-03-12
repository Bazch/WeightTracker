package nl.youngcapital.repository;

import nl.youngcapital.domain.User;
import nl.youngcapital.domain.UserLift;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLiftRepository extends CrudRepository<UserLift, Long> {

    Iterable<UserLift> findByUser(User user);
    Iterable<UserLift> findByUserName(String name);

}
