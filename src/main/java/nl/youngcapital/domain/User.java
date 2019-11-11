package nl.youngcapital.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {

    //VARIABLES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
//    private String userName;
//    private String password;
//    private Date birthDay;
//    private char sex;
//    private double length;


    //CONSTRUCTORS
    public User(){}

    public User(String name, String email) {
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
//    public Date getBirthDay() {
//        return birthDay;
//    }
//    public void setBirthDay(Date birthDay) {
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
