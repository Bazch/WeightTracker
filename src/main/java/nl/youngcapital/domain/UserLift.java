package nl.youngcapital.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserLift {

    //VARIABLES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JsonBackReference
    @ManyToOne(fetch= FetchType.EAGER)
    private User user;

    @JsonManagedReference
    @OneToMany(mappedBy = "userLift", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<UserLiftDetails> liftDetails;

    private String title;

    //CONSTRUCTORS
    private UserLift(){}
    public UserLift(String title, User user) {
        this.user = user;
        this.title = title;
    }

    //GETTERS&SETTERS
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public List<UserLiftDetails> getLiftDetails() {
        return liftDetails;
    }
    public void setLiftDetails(List<UserLiftDetails> liftDetails) {
        this.liftDetails = liftDetails;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    //METHODS

}
