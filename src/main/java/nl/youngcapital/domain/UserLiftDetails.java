package nl.youngcapital.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class UserLiftDetails {

    //VARIABLES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JsonBackReference
    @ManyToOne(fetch= FetchType.EAGER)
    private UserLift userLift;

    private float value;
    private int reps;
    private LocalDate date;

    //CONSTRUCTORS
    private UserLiftDetails(){}
    public UserLiftDetails(float value, LocalDate date, int reps, UserLift userLift) {
        this.userLift = userLift;
        this.value = value;
        this.date = date;
        this.reps = reps;
    }

    //GETTERS & SETTERS
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public UserLift getUserLift() {
        return userLift;
    }
    public void setUserLift(UserLift userLift) {
        this.userLift = userLift;
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
    public int getReps() {
        return reps;
    }
    public void setReps(int reps) {
        this.reps = reps;
    }
    //METHODS

}
