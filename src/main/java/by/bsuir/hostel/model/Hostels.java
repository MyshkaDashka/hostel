package by.bsuir.hostel.model;

import javax.persistence.*;

/**
 * Created by Dashka on 12.12.2014.
 */
@Entity
@Table (name = "Hostels")
public class Hostels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private  Integer id;
    @Column
    private Integer number;
    @Column
    private String street;
    @Column
    private String house;
    @Column
    private Integer countStudent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public Integer getCountStudent() {
        return countStudent;
    }

    public void setCountStudent(Integer countStudent) {
        this.countStudent = countStudent;
    }
}
