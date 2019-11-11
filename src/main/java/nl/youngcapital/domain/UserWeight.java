package nl.youngcapital.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class UserWeight {

   //VARIABLES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @ManyToOne
//    User user;
    int userId;
    private float value;
    private LocalDate date;

    //CONSTRUCTORS
    public UserWeight(){}
    public UserWeight(int userId, float weight){
    this.userId = userId;
    this.value = weight;
    this.date = LocalDate.now();
    }

    //GETTERS & SETTERS
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
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
}
