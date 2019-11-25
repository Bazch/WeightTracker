package nl.youngcapital.domain;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class User {

    //VARIABLES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;

//    @OneToMany (mappedBy = "user")
//    private Set<UserWeight> weights;

//    private String userName;
//    private String password;
//    private LocalDate birthDay;
//    private char sex;
//    private double length;


    //CONSTRUCTORS
    public User(){}
    public User(String name){
        this.name = name;
    }
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    //GETTERS & SETTERS
    public long getId(){return id;}
    public void setId(long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
//    public Set<UserWeight> getWeights() {
//        return weights;
//    }
//    public void setWeights(Set<UserWeight> weights) {
//        this.weights = weights;
//    }


//    public String getUserName() {
//        return userName;
//    }
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//    public String getPassword() {
//        return password;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
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
//    public char getSex() {
//        return sex;
//    }
//    public void setSex(char sex) {
//        this.sex = sex;
//    }
//    public double getLength() {
//        return length;
//    }
//    public void setLength(double length) {
//        this.length = length;
//    }


    //TOSTRING OVERRIDE

    @Override
    public String toString() {
        return "naam: "+name+" email: "+email;
    }
}
