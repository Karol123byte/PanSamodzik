package pl.sda.projekt.pansamochodzik.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Column
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "Imię")
    private String firstName;

    @Column(name = "Nazwisko")
    private String lastName;

    @Column (name = "EMail")
    private String eMail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public User() {
    }
}
