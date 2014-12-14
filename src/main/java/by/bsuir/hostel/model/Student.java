package by.bsuir.hostel.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Dashka on 12.12.2014.
 */
@Entity
@Table (name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private  Integer id;
    @Column
    private Integer id_type;
    @Column
    private String lastName;
    @Column
    private String name;
    @Column
    private  String fatherName;
    @Column
    private Date birthday;
    @Column
    private Integer groupe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_type() {
        return id_type;
    }

    public void setId_type(Integer id_type) {
        this.id_type = id_type;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getGroupe() {
        return groupe;
    }

    public void setGroupe(Integer groupe) {
        this.groupe = groupe;
    }
}
