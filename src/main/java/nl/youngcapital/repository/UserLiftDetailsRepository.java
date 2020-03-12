package nl.youngcapital.repository;

import nl.youngcapital.domain.UserLiftDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLiftDetailsRepository extends CrudRepository<UserLiftDetails, Long> {


}
