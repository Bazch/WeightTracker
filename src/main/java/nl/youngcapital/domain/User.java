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
    private String sex;
    private Float length;

//    private LocalDate birthDay;
//    private String userName;
//    private String password;


    //CONSTRUCTORS
    public User(){}

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
    public void setname(String name) {
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

    //TOSTRING OVERRIDE

    @Override
    public String toString() {
        return "naam: "+name+" email: "+email;
    }
}
