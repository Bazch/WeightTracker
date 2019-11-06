package nl.youngcapital.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class UserWeight {

   //VARIABLES
    @Id
    private int id;

    @ManyToOne
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
    public int getId() {
        return id;
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
