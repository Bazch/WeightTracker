package nl.youngcapital.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "DBUser")
public class User {

    //VARIABLES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String sex;
    private Float length;
    @Column(unique = true)
    private String username;
    private String password;
    @JsonManagedReference
    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<UserWeight> userWeights;


    //CONSTRUCTORS
    public User(){}
    public User(String username, String password,String name, String email, String sex, Float length){
        this.name = name;
        this.email = email;
        this.sex = sex;
        this.length = length;
        this.username = username;
        this.password = password;
    }

    //GETTERS & SETTERS
    public long getId(){return id;}
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Float getLength() {
        return length;
    }
    public void setLength(Float length) {
        this.length = length;
    }
    public List<UserWeight> getUserWeights() {
        return userWeights;
    }
    public void setUserWeights(List<UserWeight> userWeights) {
        this.userWeights = userWeights;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String userName) {
        this.username = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


//    public String getLastName() {
//        return lastName;
//    }
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//    public LocalDate getBirthDay() {
//        return birthDay;
//    }
//    public void setBirthDay(LocalDate birthDay) {
//        this.birthDay = birthDay;
//    }

    //TOSTRING OVERRIDE
    @Override
    public String toString() {
        return "naam: "+name+" email: "+email;
    }
}
