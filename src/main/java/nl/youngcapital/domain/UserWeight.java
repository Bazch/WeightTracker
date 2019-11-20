package nl.youngcapital.domain;


import nl.youngcapital.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Optional;

@Entity
public class UserWeight {

   //VARIABLES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch=FetchType.LAZY)
    private User user;
    private float value;
    private LocalDate date;

    //CONSTRUCTORS
    public UserWeight(){
        this.date = LocalDate.now();
    }
    public UserWeight(float value, User user){
        this.value = value;
        this.user = user;
        this.date = LocalDate.now();
    }

    //GETTERS & SETTERS
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
